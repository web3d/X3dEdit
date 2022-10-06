@echo X3D-Edit for Extensible 3D (X3D) Graphics scenes, 64-bit
@echo          https://savage.nps.edu/X3D-Edit
@echo on

@rem Memory settings for X3D-Edit 4.0:  see ReadmeX3D-EditMemorySettings.txt
set MEMORYSETTINGS=-J-Xss2m -J-Xms32m -J-Xmx512m

@rem if environment variable JAVA_HOME is not set in the system properties,
@rem Windows users may need to insert a switch like the following:
@rem    --jdkhome "C:/Program Files/Java/jdk1.8.0_60/"

@rem =======================================================================
@rem How To Check If Computer Is Running A 32 Bit or 64 Bit Operating System
@rem https://support.microsoft.com/en-us/kb/556009

@echo off

Set RegQry=HKLM\Hardware\Description\System\CentralProcessor\0

REG.exe Query %RegQry% > checkOS.txt
@rem CAT checkOS.txt

FIND /I "x86" < checkOS.txt > stringCheck.txt

If %ERRORLEVEL% == 0 (
    echo Running 32-bit x3dedit33.exe
    x3dedit33\bin\x3dedit33.exe --console suppress
) ELSE (
    echo Running 64-bit x3dedit3364.exe
    x3dedit33\bin\x3dedit3364.exe --console suppress
)
DEL checkOS.txt stringCheck.txt
@rem =======================================================================

@rem Debugging option:  uncomment the following Pause command to view console messages prior to exit:
@rem Pause
