#!groovy
node {
   stage('Preparation') { // for display purposes
      // Get code from a GitHub repository
      git 'https://github.com/nicolas2lee/WithU'
   }
   stage('Build') {
      // Run the maven build
      //def os = System.properties['os.name'].toLowerCase()
      //echo "OS: ${os}"
      if (isUnix()) {
         sh "mvn clean install"
      } else {
         bat(/mvn clean install/)
      }
   }

   stage('Deploy'){
        sh "cp /Users/xinrui/.jenkins/workspace/WithUPipeline/withu-rest/target/withu-rest-1.0-SNAPSHOT.war /Users/xinrui/server/apache-tomcat-8.5.8/webapps"
   }
}