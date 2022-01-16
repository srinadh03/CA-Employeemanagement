package EmployeeDataManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This are the main class for our springboot web rest services 
 *here the the springbootapplication uses springboot mainly 
 *its annotation is used to mark the configuration class to declare bean classes
 *and auto-configuration and component scanning
 *
 */

@SpringBootApplication
public class CaEmployeeDataManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaEmployeeDataManagementApplication.class, args);
	}

}
