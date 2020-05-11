#! /bin/bash
docker-compose down
#mvn package需要连接数据库，并清空，所以优先启动db服务
docker-compose up -d db
git pull
mvn clean package
docker-compose up -d web