package aon.developer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Task1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
		
		
	}

}
