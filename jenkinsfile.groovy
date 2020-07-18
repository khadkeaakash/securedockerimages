
pipeline {
    agent {label "ubuntu"
          }//end of agent

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            } //end of steps
        } //end of stage build

    } //end of stages
} //end of pipeline
