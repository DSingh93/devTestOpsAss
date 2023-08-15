pipeline { 
    agent any
    envirnment{
	    PATH = "$PATH:/opt/apache-maven-3.8.2/bin"
    } 
    stages {
	stage('build'){
		sh 'mvn clean package'
	}

    }
}
