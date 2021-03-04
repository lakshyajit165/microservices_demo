#!/bin/bash

# $# checks for commandline arguments
# No arguments => start all services
# Example arguments => ./start_services.sh discovery dashboard-service
# $! gives the pid of the last command
# nohup runs a jar in the background

if [ "$#" -eq 0 ]; then

    echo "Starting all services...";
    
    services=(discovery gateway dashboard-service pricing-service micro-ui)

    for i in "${services[@]}"
    do 
        cd ./"$i"
        mvn clean package -DskipTests

        if [ "$i" = "discovery" ]; then
            nohup java -jar ./target/"${i}"-1.0.0-SNAPSHOT.jar > ../server_log.txt 2>&1 &  # write into the log/pid file starting from first micro-service
            echo $! $i > ../pid.file
        else
            nohup java -jar ./target/"${i}"-1.0.0-SNAPSHOT.jar >> ../server_log.txt 2>&1 & # append to the log/pid file
            echo $! $i >> ../pid.file
        fi
        
        cd ..
    done

else 

    for service in "$@" 

    do
        echo "Starting $service...";
        cd ./"$service"
        mvn clean package -DskipTests

        nohup java -jar ./target/"${service}"-1.0.0-SNAPSHOT.jar >> ../server_log.txt 2>&1 &
        echo $! $service >> ../pid.file

        cd ..
    done

fi


        




