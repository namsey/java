@Library("shared-library") _
pipeline {
    agent any
    stages {
        stage('Code Build') {
            steps {
            javaBuild()
            } 
        }
        stage('Code Test') {
            steps {
                javaTest()
            }
        } 
	stage('SonarQube Analysis') {
	    steps {
		sonar()
	    }	
	}
	stage('QualityGate Analysis') {
	   steps {
              timeout(time: 15, unit: 'MINUTES') {
                waitForQualityGate abortPipeline: true
	    }
	}
    }
    }
}	
