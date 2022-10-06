ReadmeX3D-EditMemorySettings.txt: Memory settings for X3D-Edit 3.2

Determining the proper memory settings for X3D-Edit has turned out to be
somewhat of a trial and error process.  Each script launches the X3D-Edit
program (called "Launcher" here) within subdirectory x3deditor32/bin.
On Mac and Unix, Launcher is a shell script; on Windows a batch file
points to the binary run-time executable.

The Launcher files for Windows, Mac and Unix are
    runX3dEditWin.bat
    runX3dEditMac.sh.command
    runX3dEditUnix.sh

Assuming the Windows executable does approximately the same sequence of
operations as the script version does, Launcher in turn runs the Java virtual
machine, starting the editor.  Launcher passes some parameters to the jvm,
and by default, the memory settings that it passes are located in
x3deditor/etc/x3deditor32.conf.  The command line parameters specified in the
Launcher batch file and scripts are also passed. (Note that the ordering
of switches starting with -J before -X is a netbeans requirement.)

Therefore, default behavior is to launch the jvm with the netbeans-defined
default memory parameters, plus the ones above.

The 3 jvm settings controlled by the Launcher batch file and scripts are
defined thusly:
-Xss16m : set the application stack size to 16 Mbytes.  The stack is
    apparently not growable, so once your running application hits the limit,
    you get an error message and have to shut down or restart if you can.
    Testing to date has shown settings above this value might not work properly.
-Xms768m : set the initial heap size to 768 Mbytes.  This is not the
    "minimum" heap size.  There is no concept of a minimum size -- the heap
    will always grow if it needs to. This is the size that is _initially_
    given to the jvm.  The heap may grow beyond this, as long as it doesn't
    exceed the max heap size.
-Xmx768m : set the maximum heap size to 768 Mbytes.  This is the maximum size
    that the application can ever request from the OS when it needs memory space.
    If the application exceeds this limit, users get an error message and have to
    shut down or kill the now-unresponsive application.

This last -Xmx setting (for maximum heap size) remains controversial since
it seems to provoke problems on Windows Vista operating system, and would also
seem to place an unnecessary limit on more powerful machines.  Current default
settings do impose this upper limit, but the switch is available as a comment
in the batch file and shell scripts, and can be manually edited and/or enabled
by the local user if desired.

Maximum maximums:
The largest number that may appear in the Xms and Xmx parameters is a function
of OS and processor word size.  A 32-bit processor running a 32-bit jvm can
address 4G bytes.  A 32-bit Windows machine has a limit of, in general,
2000M minus some overhead.  Testing on a Vista machine found 1592m as the max;
on some XP machines, 1280M.

Although not thoroughly tested, a 64-bit Mac running a 64-bit jvm has a limit
of 127T minus overhead... and that is essentially no limit.  Remember, these
operating systems also implement virtual memory systems, and that
is the "kind" of memory given to a JVM.  Adverse performance limitations
(disk paging) may appear with some settings.

Stack choice for X3D-Edit:
Some of the XML validation routines in the system libraries are rather
"recursion intensive".  This means they can chew up stack allocation quickly.
Some X3d scenes have large coordinate arrays within, for instance,
IndexedFaceSet elements, which trigger recursive processing.  If the
stack is not set high enough when these files are validated, then a
stack error will appear.

Initial heap choice for X3D-Edit:
This number (768m) has been arrived at from trial and error.  Perhaps
counterintuitively, some _higher_ settings than 768m have caused memory
exceptions on some machines.  Logically, lower settings that this will
often not provide enough room for Xj3D to render complex scenes, which
is to be expected.  Further study of the first case is warranted.  Setting
Xms and Xmx the same means "OS, give me this amount of memory, and give it
all to me now.  I will never require more."  If the application _does_
require more, an error message appears and you must shut down or kill
the application.

Compiling and launching X3D-Edit application from within Netbeans:
This script is not used for launching the application from Netbeans.
Use the "run.args.extra" property within the file
    X3DEditorSuite/nbproject/project.properties
to emulate the launch commands in this file.  Memory values may have to be
changed because the run-time environment is different.  The default value
in the properties file from the subversion repository _should_ suffice.

Running X3D-Edit modules within Netbeans:
If the X3D-Edit modules are installed into a version of the Netbeans IDE,
the memory settings of the Netbeans application itself may require adjustment.
This is done by editing the etc/netbeans.conf file within the installed
application directory.  No systematic testing of appropriate values has been
performed; different Netbeans platform releases may introduce different
requirements.  In general, insure the stack size is at least as large as above,
and begin bumping Xms upward, then retest.

Feedback and improvements are always welcome:
    x3d-public@web3d.org
    x3d-edit-developers@movesInstitute.org
    https://savage.nps.edu/X3D-Edit
