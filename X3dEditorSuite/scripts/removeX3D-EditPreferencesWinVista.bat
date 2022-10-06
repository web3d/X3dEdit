@echo X3D-Edit for Extensible 3D (X3D) Graphics scenes
@echo          https://savage.nps.edu/X3D-Edit

@echo Warning!

@echo This batch file removes a user's X3D-Edit 4.0 preferences,
@echo list of recent files, added plugins, configuration data, etc.
@echo This step may be needed to fix out-of-date or garbled installations.

@REM @echo Usual prerequisite:  uninstall X3D-Edit

@echo Windows Vista cleanup:
@echo Delete %APPDATA%\.x3dedit33\ and all contents when ready:
@pause
rmdir /S /Q "%APPDATA%\.x3dedit33\"
@pause
