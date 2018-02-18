
pipeline {
    agent any
    tools {
            maven 'maven 3'
            jdk 'java 8'
            org.jenkinsci.plugins.docker.commons.tools.DockerTool 'docker'
    }
    environment {
        DockerHub_Access = credentials('gnoxy-docker-hub')
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage ('Deploy') {
            steps {
                sh 'docker login -u="$DockerHub_Access_USR" -p="$DockerHub_Access_PSW"'
                sh 'docker push gnoxy/kynexus'
            }
        }
    }
}


