@echo X3D-Edit for Extensible 3D (X3D) Graphics scenes
@echo          https://savage.nps.edu/X3D-Edit

@echo Warning!

@echo This batch file removes a user's X3D-Edit 4.0 preferences,
@echo list of recent files, added plugins, configuration data, etc.
@echo This step may be needed to fix out-of-date or garbled installations.

@rem @echo Usual prerequisite:  uninstall X3D-Edit

@echo ==================
@echo WindowsXP cleanup:
@echo Delete %USERPROFILE%\Application Data\.x3dedit33\ and all contents when ready:
rmdir /S /Q "%USERPROFILE%\Application Data\.x3dedit33\"

@echo ==================
@echo Windows 7 cleanup:
@echo Delete %USERPROFILE%\AppData\Roaming\.x3dedit33\ and all contents when ready:
rmdir /S /Q "%USERPROFILE%\Application Data\.x3dedit33\"
@echo ==================
@pause
