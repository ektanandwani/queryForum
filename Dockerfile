FROM tomcat:9.0.27
ADD target/*.war /usr/local/tomcat/webapps/queryForum_war.war
#ADD target/queryForum /usr/local/tomcat/webapps/queryForum/
EXPOSE 8080
