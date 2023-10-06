FROM tomcat:7.0
EXPOSE 8080
COPY target/prod.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
