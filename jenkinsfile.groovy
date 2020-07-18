
pipeline {
    agent {label "ubuntu"
          }//end of agent

    stages {
        stage('Build') {
            steps {
                echo 'Building docker image for ubuntu'
                sh '''
                
                #docker build --tag ubuntu-original:focal --file
                curl -s 'https://partner-images.canonical.com/core/focal/current/ubuntu-focal-core-cloudimg-amd64-root.tar.gz' > /dev/null
                docker build --no-cache -t ubuntu-original:focal -f ubuntu-focal-original .
                
                '''
            } //end of steps
        } //end of stage build

    } //end of stages
} //end of pipeline
