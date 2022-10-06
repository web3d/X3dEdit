#!/bin/bash

# cleanPrivateProperties.sh

# clean nbproject/private//private.properties in X3D-Edit module directories
# to reset before install for deployment steps

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
  fi
}

cleanPrivelegedPropertyFile()
{
  if [ -s $FILENAME ]
    then
      rm -v $FILENAME
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


FILENAME="$APACHE/private.properties" ;        cleanPrivelegedPropertyFile
FILENAME="$COLLADA/private.properties" ;       cleanPrivelegedPropertyFile
FILENAME="$JDOM/private.properties" ;          cleanPrivelegedPropertyFile
FILENAME="$JHELP/private.properties" ;         cleanPrivelegedPropertyFile
FILENAME="$KML/private.properties" ;           cleanPrivelegedPropertyFile
FILENAME="$X3D/private.properties" ;           cleanPrivelegedPropertyFile
FILENAME="$XJ3D/private.properties" ;          cleanPrivelegedPropertyFile
FILENAME="$SUITE/private.properties" ;         cleanPrivelegedPropertyFile
FILENAME="$CONFIG/private.properties" ;        cleanPrivelegedPropertyFile
