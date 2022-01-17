FROM openjdk:8 as build
EXPOSE 9191
ADD target/CA-EmployeeManagement.jar ca-employeemanagement.jar
ENTRYPOINT ["java", "-jar", "/ca-employeemanagement.jar"]