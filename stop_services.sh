#!/bin/bash

if [ "$#" -eq 0 ]; then
    echo "Stopping all services!";
    kill $(awk '{ print $1 }' ./pid.file);
else
    for service in "$@" 
    do
        echo "Stopping $service!";
        kill $(cat ./pid.file | grep "$service" | awk '{ print $1 }')
        sed -i "/$service/d" ./pid.file # delete the line containing the pid in the file      
    done
fi

# kill $(awk '{ print $1 }' ./pid.file)