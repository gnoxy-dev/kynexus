
pipeline {
    agent any
    tools {
            maven 'maven 3'
            jdk 'java 8'
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
                sh 'docker push gnoxy/kynexus:1.3.01'
            }
        }
    }
}


