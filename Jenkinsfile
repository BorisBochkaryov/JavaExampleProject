pipeline {
  agent any
  stages {
    stage('Buld') {
      steps {
        sh 'gradle build'
      }
    }
    stage('Jar') {
      steps {
        sh 'gradle jar'
      }
    }
  }
  post {
    always {
      archiveArtifacts artifacts: '*.tar.gz', fingerprint: true
    }
  }
}
