#!/bin/sh
# Shell file to run X3D-Edit 4.0

echo "X3D-Edit for Extensible 3D (X3D) Graphics scenes"
echo          https://savage.nps.edu/X3D-Edit

# First make sure we're running a satisfactory version of Java, otherwise exit if not
source javaVersionCheck.sh

# Memory settings for X3D-Edit 4.0:  see ReadmeX3D-EditMemorySettings.txt
# The default settings for a zipped app exist in x3dedit33/etc/x3dedit33.conf
# The stack (-Xss2m) setting is under evaluation and may need
# increasing because of recursive routines in XML and XSLT processing.

# Xms768m allocates 768 Mb to the Java heap on startup.  Xmx768m sets a limit on incremental allocations to the heap.
# If your usage case will normally always require the maximum, set both and performance will slightly increase
# because incremental allocations (to the OS) are eliminated.

# Rule of thumb is to set at one half of your physical RAM capacity, no higher
# REF: http://performance.netbeans.org/howto/jvmswitches
MAXMEMHEAP=-J-Xmx1g
MEMORYSETTINGS="-J-Xss2m -J-Xms32m $MAXMEMHEAP"

# Use the quoting mess to handle spaces in the path
THISDIR=`dirname "$0"`
cd "$THISDIR"
cd x3dedit33/bin
sh x3dedit33 -J-Djava.ext.dirs=`/usr/libexec/java_home`/lib/ext $MEMORYSETTINGS
