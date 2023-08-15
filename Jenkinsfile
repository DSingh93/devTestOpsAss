pipeline {
    agent any
    environment{
        PATH = "C:\\apache-maven-3.9.4\\bin:$PATH"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/DSingh93/devTestOpsAss'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                bat "mvn clean package"
            }
        }
    }
}
