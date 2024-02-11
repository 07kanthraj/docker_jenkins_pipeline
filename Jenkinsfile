pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-credentials')
        DOCKER_IMAGE_NAME = 'yourdockerhubusername/yourimage:tag'
    }

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image from Dockerfile
                    docker.build("${DOCKER_IMAGE_NAME}", "-f Dockerfile .")
                }
            }
        }

        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    // Push Docker image to Docker Hub
                    docker.withRegistry('https://index.docker.io/v1/', "${DOCKER_HUB_CREDENTIALS}") {
                        docker.image("${DOCKER_IMAGE_NAME}").push()
                    }
                }
            }
        }

        stage('Pull and Run Docker Image') {
            steps {
                script {
                    // Pull Docker image from Docker Hub
                    docker.image("${DOCKER_IMAGE_NAME}").pull()

                    // Run Docker container from the pulled image
                    docker.image("${DOCKER_IMAGE_NAME}").run("-p 8080:80 --name my_container_name")
                }
            }
        }
    }
}
