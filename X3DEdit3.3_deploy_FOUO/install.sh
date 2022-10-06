#!/bin/bash

echo check permissions:
chmod 664 private.properties
chmod 664 movesJarSigningKeystore
ls -al private.properties movesJarSigningKeystore

# copy private.properties file (modified to include signing and deployment passwords)
# to each individual Netbeans module

APACHE="../ApacheXMLApis/nbproject/private"
COLLADA="../Collada/nbproject/private"
JDOM="../JdomWrapper/nbproject/private"
JHELP="../JavaHelpWrapper/nbproject/private"
KML="../../KmlEditorModule/nbproject/private"
X3D="../X3D/nbproject/private"
XJ3D="../Xj3dWrapper/nbproject/private"
SUITE="../X3dEditorSuite/nbproject/private"
CONFIG="$SUITE/X3dAppConfiguration/nbproject/private"

checkDir()
{
  if [ -d $TDIR ]
    then
      echo "$TDIR exists"
    else
      echo "$TDIR not found... creating it:"
      mkdir $TDIR
  fi
}

cleanDir()
{
  if [ -d $TDIR ]
    then
      echo "Removing $TDIR"
      rm $TDIR/private.properties
  fi
}

copyPrivPropFile()
{
  if [ -s $FILENAME ]
    then
      echo "$FILENAME exists and has non-zero length.  Backing up prior version to ./private.properties.bak"
      cat    private.properties >> private.properties.bak
      ls -al private.properties.bak
      cp -vf private.properties $FILENAME
    else
      cp -vf private.properties $FILENAME
  fi
}
CLEAN=0 # 0=false, otherwise 1=true

# cleanDir is optional
if [ $CLEAN -eq 1 ]
  then
    TDIR=$APACHE ;  cleanDir
    TDIR=$COLLADA ; cleanDir
    TDIR=$JDOM ;    cleanDir
    TDIR=$JHELP ;   checkDir
    TDIR=$KML ;     cleanDir
    TDIR=$X3D ;     cleanDir
    TDIR=$XJ3D  ;   cleanDir
    TDIR=$SUITE ;   cleanDir
    TDIR=$CONFIG ;  cleanDir
fi

TDIR=$APACHE ;  checkDir
TDIR=$COLLADA ; checkDir
TDIR=$JDOM ;    checkDir
TDIR=$JHELP ;   checkDir
TDIR=$KML ;     checkDir
TDIR=$X3D ;     checkDir
TDIR=$XJ3D  ;   checkDir
TDIR=$SUITE ;   checkDir
TDIR=$CONFIG ;  checkDir

cp -vf movesJarSigningKeystore $APACHE
cp -vf movesJarSigningKeystore $COLLADA
cp -vf movesJarSigningKeystore $JDOM
cp -vf movesJarSigningKeystore $JHELP
cp -vf movesJarSigningKeystore $KML
cp -vf movesJarSigningKeystore $X3D
cp -vf movesJarSigningKeystore $XJ3D
cp -vf movesJarSigningKeystore $SUITE
cp -vf movesJarSigningKeystore $CONFIG

FILENAME="$APACHE/private.properties" ;  copyPrivPropFile
FILENAME="$COLLADA/private.properties" ; copyPrivPropFile
FILENAME="$JDOM/private.properties" ;    copyPrivPropFile
FILENAME="$JHELP/private.properties: ;   copyPrivPropFile
FILENAME="$KML/private.properties" ;     copyPrivPropFile
FILENAME="$X3D/private.properties" ;     copyPrivPropFile
FILENAME="$XJ3D/private.properties" ;    copyPrivPropFile
FILENAME="$SUITE/private.properties" ;   copyPrivPropFile
FILENAME="$CONFIG/private.properties" ;  copyPrivPropFile
