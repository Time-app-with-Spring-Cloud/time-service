#!/bin/sh

# Hack to give time to Eureka to start up before calling it. Use with care.
sleep 10
java -jar time-service.jar