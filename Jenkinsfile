pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage('build maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/07kanthraj/docker_jenkins_pipeline.git']])
                sh 'mvn clean install'
                sh 'mvn install -Dmaven.plugin.validation=VERBOSE'
            }
        }
        stage('build docker image'){
        steps{
            script{
                sh 'docker build -t 07kanthraj/docker_jenkins_pipeline .'
            }
        }
    }
}
}
