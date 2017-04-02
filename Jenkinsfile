#!groovy
node {
   stage('Preparation') { // for display purposes
      // Get code from a GitHub repository
      git 'https://github.com/nicolas2lee/WithU'
   }
   stage('Build') {
      withMaven(
              maven: 'M3', // Maven installation declared in the Jenkins "Global Tool Configuration"
              //mavenSettingsConfig: 'my-maven-settings', // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
              mavenLocalRepo: '.repository') {
         sh "mvn clean install"

      }
   }

   stage('Deploy'){
        sh "cp /Users/xinrui/.jenkins/workspace/withu-pipeline/withu-rest/target/withu-rest-1.0-SNAPSHOT.war " +
                "/Users/xinrui/tao/server/apache-tomcat-9.0.0.M17/webapps"
   }
}