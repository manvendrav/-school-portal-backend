package main.java.com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SchoolPortalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolPortalBackendApplication.class, args);
	}

}
