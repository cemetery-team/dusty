node {
        stage('git clone'){
            git branch: 'master', credentialsId: '0d926019-b1c1-4288-b928-e2373cbb9b6c', url: 'git@github.com:cemetery-team/dusty.git'
        }
        stage('gradle tests') {
            withGradle {
                sh '/opt/gradle/gradle-6.1.1/bin/gradle test --stacktrace --debug'
            }
        }
        stage('gradle build') {
            withGradle {
                sh '/opt/gradle/gradle-6.1.1/bin/gradle build --stacktrace'
            }
        }
        stage('deploy') {
            sh 'sudo systemctl stop dusty'
            sh 'sudo cp /var/lib/jenkins/workspace/dusty/build/libs/dusty.jar /usr/bin/'
        }
        stage('run'){
            sh 'sudo systemctl start dusty'
        }
}