#!/bin/bash
sudo yum update
sudo yum upgrade -y
sudo yum -y install docker
sudo service docker start

sudo wget -P /sonarqube/extensions/plugins https://github.com/mc1arke/sonarqube-community-branch-plugin/releases/download/1.23.0/sonarqube-community-branch-plugin-1.23.0.jar

sudo docker run \
  -p 80:9000 \
  -v /sonarqube/extensions:/opt/sonarqube/extensions \
  -e SONAR_WEB_JAVAADDITIONALOPTS="-javaagent:/opt/sonarqube/extensions/plugins/sonarqube-community-branch-plugin-1.23.0.jar=web" \
  -e SONAR_CE_JAVAADDITIONALOPTS="-javaagent:/opt/sonarqube/extensions/plugins/sonarqube-community-branch-plugin-1.23.0.jar=ce" \
  sonarqube:25.1.0.102122-community