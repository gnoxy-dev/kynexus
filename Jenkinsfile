
pipeline {
    agent any
    tools {
            maven 'maven-3.3.9'
            jdk 'jdk1.8.0_144'
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


