pipeline {
    agent any

    tools {
        maven 'Maven3'   // The Maven name you configured in Jenkins Global Tools
        jdk 'JDK11'      // The JDK name you configured in Jenkins Global Tools
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                // If you connect GitHub later, Jenkins will pull automatically
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running Selenium Tests...'
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Publishing test reports...'
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
