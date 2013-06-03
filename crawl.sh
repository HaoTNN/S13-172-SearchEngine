#!/bin/sh

if [ ! $# -eq 4 ]; then
	echo "Usage: <seed> <numPages:int> <depth:int> <output-dir>"
	exit 1
fi
javac -cp .:jsoup-1.7.2.jar mainPackage/main.java
java -cp .:jsoup-1.7.2.jar mainPackage/main $1 $2 $3 $4
