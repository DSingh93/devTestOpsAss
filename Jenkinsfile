pipeline { 
    agent {lable 'linux'}
    options {
	    buildDiscarder(logRotator(numToKeepStr: '5'))
    }  
    stages {
        stage('Scan') {
            steps {             
				withSonarQubeEnv(installationName: 'SQ1'){
					sh './mvn clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
				}
            }
        }
    }
}
