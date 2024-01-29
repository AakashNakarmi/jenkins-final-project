pipeline {
    agent any
    tools{
        maven 'maven_3_9_6'
    }

    stages {
        stage('Git Extract') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AakashNakarmi/jenkins-final-project']])
            }
        }
        stage("Build Maven Project"){
            steps{
                bat 'mvn clean install'
            }
        }
        stage("Build Docker Image of Project"){
            steps{
                bat 'docker build -t aakashnakarmi/jenkins-final-project .'
            }
        }
        stage("Push Image to Registry"){
            steps{
                bat 'docker login -u aakashnakarmi -p TYbv?5awW?8WrWe docker.io'
                bat 'docker push aakashnakarmi/jenkins-final-project'

                }
            }

        }
    }


