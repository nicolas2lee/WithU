#!groovy
node {
   stage('Preparation') { // for display purposes
      // Get code from a GitHub repository
      git 'https://github.com/nicolas2lee/WithU'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "mvn clean install"
      } else {
         bat(/mvn clean install/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}