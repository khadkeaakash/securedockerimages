
pipeline {
    agent {label "ubuntu"
          }//end of agent

    stages {
        stage('Build') {
            steps {
                echo 'Building docker image for ubuntu'
                sh '''
                
                #docker build --tag ubuntu-original:focal --file 
                docker build --no-cache -t ubuntu-original:focal -f ubuntu-focal-original .
                
                '''
            } //end of steps
        } //end of stage build

    } //end of stages
} //end of pipeline
