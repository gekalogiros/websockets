#!/usr/bin/env bash

EXECUTABLE="entrypoint/build/libs/entrypoint.jar"

if [ ! -f $EXECUTABLE ]; then
    gradle clean build
fi

java -jar entrypoint/build/libs/entrypoint.jar