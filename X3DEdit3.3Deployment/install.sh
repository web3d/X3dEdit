#!/bin/bash

echo check permissions:
chmod 664 private.properties
chmod 664 movesJarSigningKeystore
ls -al private.properties movesJarSigningKeystore

# copy movesJarSigningKeystore into X3D-Edit module directories to simplify deployment steps

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
      echo "$TDIR not found..making it"
      mkdir $TDIR
  fi
}

copyPrivelegedPropertyFile()
{
  if [ -s $FILENAME ]
    then
      echo "Target $FILENAME has non-zero length."
      echo "Appending to ./private.properties to add additional values."
      cat   private.properties >> $FILENAME
    else
      cp -v private.properties    $FILENAME
  fi
}

TDIR=$APACHE ;        checkDir
TDIR=$COLLADA ;       checkDir
TDIR=$JDOM ;          checkDir
TDIR=$JHELP ;         checkDir
TDIR=$KML ;           checkDir
TDIR=$X3D ;           checkDir
TDIR=$XJ3D ;          checkDir
TDIR=$SUITE ;         checkDir
TDIR=$CONFIG ;        checkDir

cp -v movesJarSigningKeystore $APACHE
cp -v movesJarSigningKeystore $COLLADA
cp -v movesJarSigningKeystore $JDOM
cp -v movesJarSigningKeystore $JHELP
cp -v movesJarSigningKeystore $KML
cp -v movesJarSigningKeystore $X3D
cp -v movesJarSigningKeystore $XJ3D
cp -v movesJarSigningKeystore $SUITE
cp -v movesJarSigningKeystore $CONFIG

FILENAME="$APACHE/private.properties" ;        copyPrivelegedPropertyFile
FILENAME="$COLLADA/private.properties" ;       copyPrivelegedPropertyFile
FILENAME="$JDOM/private.properties" ;          copyPrivelegedPropertyFile
FILENAME="$JHELP/private.properties" ;         copyPrivelegedPropertyFile
FILENAME="$KML/private.properties" ;           copyPrivelegedPropertyFile
FILENAME="$X3D/private.properties" ;           copyPrivelegedPropertyFile
FILENAME="$XJ3D/private.properties" ;          copyPrivelegedPropertyFile
FILENAME="$SUITE/private.properties" ;         copyPrivelegedPropertyFile
FILENAME="$CONFIG/private.properties" ;        copyPrivelegedPropertyFile
