pipeline{
    agent any
    tools {
      maven 'maven3'
    }
    
    environment {
      DOCKER_TAG = getVersion()
    }

    
    stages{
        stage('SCM'){
            steps{
                git credentialsId: 'github', 
                url: 'https://github.com/akshaymg99/DevOps_Calculator.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh "mvn clean package"
            }
        }
        stage('Docker Build'){
            steps{
                sh "docker build . -t akshaymg99/calculator:latest "
            }
        }
        stage('DockerHub Push'){
            steps{
                withCredentials([string(credentialsId: 'docker-hub', variable: 'dockerHubPwd')]) {
                    sh "docker login -u akshaymg99 -p ${dockerHubPwd}"
                }
                sh "docker push akshaymg99/calculator:latest "
            }
            
        }
        
            
    }
  
}

def getVersion(){
    def commitHash = sh returnStdout: true, script: 'git rev-parse --short HEAD'
    return commitHash
}

