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
		sonarUTL.call(
		httpUrl: "http://192.168.1.8:9000/api/qualitygates/project_status?projectKey=${Calculator}",
		username: 'admin',
		password: 'sonar'
		)
	}
    }
}
