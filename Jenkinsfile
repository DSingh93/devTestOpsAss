pipeline {
    agent any
    environment{
        PATH = "C:\\apache-maven-3.9.4\\bin:$PATH"
    }

    stages {
         stage('Git Checkout') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/DSingh93/devTestOpsAss'
            }
        }
        stage('Build') {
            steps {
                // To run Maven on a Windows agent, use
                bat "mvn clean package"
            }
        }
    }
}
