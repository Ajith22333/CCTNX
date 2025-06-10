pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Ajith22333/CCTNX.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                sh 'java -jar target/CCTNX-1.0.0.jar &'
            }
        }
    }
}
