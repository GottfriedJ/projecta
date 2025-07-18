#!/bin/bash
docker build -t my_mvn_jenkins .
docker build -t jenkins_with_docker -f Dockerfile_jenkins_docker_client .
