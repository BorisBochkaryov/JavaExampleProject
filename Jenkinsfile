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
    stage('Tar.gz') {
      steps {
        sh 'gradle totar'
      }
    }
  }
  post {
    always {
      archiveArtifacts(artifacts: '*.tar.gz', fingerprint: true)

    }

  }
}