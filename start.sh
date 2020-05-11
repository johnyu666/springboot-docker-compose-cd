#! /bin/bash
docker-compose down
git pull
mvn clean package
docker-compose up -d