package springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import springboot.config.listener.HelloApplicationListener;
import springboot.config.properties.SpringBootForConfigurationProperties;
import springboot.config.service.SpringBootForConfigurationShowProperties;


@EnableConfigurationProperties(SpringBootForConfigurationProperties.class)
@SpringBootApplication
public class SpringBootForConfigurationApplication {

	public static void main(String[] args) {
		
		// Version générée. 
		
		// Version de base.
//		SpringApplication sa = new SpringApplication();
//	    sa.addListeners(new HelloApplicationListener());
//        sa.run(args);
        
        
		// Pattern de fabrique + programmation fonctionnelle. 
		ApplicationContext context = new SpringApplicationBuilder (SpringBootForConfigurationApplication.class)
		.listeners(new HelloApplicationListener())
		.run( args);
		
		SpringBootForConfigurationShowProperties springBootForConfigurationShowProperties = context.getBean(SpringBootForConfigurationShowProperties.class);
		springBootForConfigurationShowProperties.print();
	}
	
	
	
	
}
