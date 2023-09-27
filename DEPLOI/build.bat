cd DeploiTest
@REM compile java
javac -d WEB-INF/classes *.java

@REM compresser en .war
jar -cf ../DeploiTest.war .

@REM envoie vers Tomcat
copy ../DeploiTest.war "C:\apache-tomcat-10.0.22\webapps"
cd ..