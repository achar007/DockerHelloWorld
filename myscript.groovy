pipeline {
    agent {
        // Use a Docker agent with a specific Docker image
        docker {
            image 'hello-world' // Specify the Docker image you want to use
            alwaysPull true     // Always pull the Docker image (optional)
        }
    }
    stages {
        stage('Hello World') {
            steps {
                // Run a simple shell command inside the Docker container
                sh 'echo "hello-world"'
            }
        }
    }
}
