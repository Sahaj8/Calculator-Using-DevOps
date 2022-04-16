pipeline {
		agent any 
    stages {
        stage('Git Pull') {
            steps {
				git url: 'https://github.com/Sahaj8/Calculator-Using-DevOps.git', branch: 'main'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
         stage('Docker build') {
            steps{
                script {
                    imageName=docker.build "sahajv/calculatorusingdevops"
                }
            }
        }
        stage('Docker push img') {
            steps {
                script{
                    docker.withRegistry('','docker_cred'){
                    imageName.push()
                    }
                }    
            }
        }
        stage('Ansible Deploy') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'deploy_calculator.yml', sudoUser: null
            }
        }
    }
}
