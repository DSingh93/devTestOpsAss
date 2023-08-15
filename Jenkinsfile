pipeline { 
    agent any
    environment{
	    PATH = "$PATH:/opt/apache-maven-3.8.2/bin"
    } 
    stages {
	stage('build'){
		steps{
		sh 'mvn clean package'
		}
	}

    }
}
