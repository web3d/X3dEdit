#!/bin/bash
# Script to test for minimum java version and exit if not found

# Verify Java Version     http://www.java.com/en/download/installed.jsp
# Savage Developers Guide https://savage.nps.edu/Savage/developers.html#Java

REQUIRED_VERSION=15
PREFERRED_VERSION=15

# Transform to comparable integer
RVERSION=`echo $REQUIRED_VERSION | sed -e 's;\.;0;g'`

# Get installed version
java -version 2> tmp.ver

#Isolate dotted version number
VERSIONFOUND=`cat tmp.ver | grep "java version" | awk '{ print substr($3, 2, length($3)-2); }'`

#Transform to comparable integer
VERSION=`echo $VERSIONFOUND | awk '{ print substr($1, 1, 3); }' | sed -e 's;\.;0;g'`

if [ $VERSION ]
then
	if [ $VERSION -lt $RVERSION ]
	then
		echo "This application requires at least Java" $REQUIRED_VERSION " and developers prefer Java" $PREFERRED_VERSION
		echo "Installation found:"
		cat tmp.ver
		rm  tmp.ver
		exit 1
	else
                echo "Java version" $VERSIONFOUND
#		cat tmp.ver
#		rm  tmp.ver
	fi
fi
