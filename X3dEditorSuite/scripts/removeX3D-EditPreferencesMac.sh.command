#!/bin/sh
echo "X3D-Edit for Extensible 3D (X3D) Graphics scenes"
echo          "https://savage.nps.edu/X3D-Edit"

echo Warning!
echo This is a script to remove your X3D-Edit 4.0 preferences, recent files, configuration, plugins etc.
echo which may be needed to eliminate an out-of-date or garbled prior installation
echo

cd ~/
cd "Library/Application Support"
echo Removing "x3dedit33/"
echo in
pwd
echo control-c to cancel
read answer

rm -rfd x3dedit33
echo done
