@echo X3D-Edit for Extensible 3D (X3D) Graphics scenes
@echo          https://savage.nps.edu/X3D-Edit
@echo on

@rem Memory settings for X3D-Edit 4.0:  see ReadmeX3D-EditMemorySettings.txt
set MEMORYSETTINGS=-J-Xss2m -J-Xms32m -J-Xmx512m

@rem if environment variable JAVA_HOME is not set in the system properties,
@rem Windows users may need to insert a switch like the following:
@rem    --jdkhome "C:/Program Files/Java/jdk1.8.0_60/"

x3dedit33\bin\x3dedit33.exe --console suppress

@rem Debugging option:  uncomment the following Pause command to view console messages prior to exit:
@rem Pause
