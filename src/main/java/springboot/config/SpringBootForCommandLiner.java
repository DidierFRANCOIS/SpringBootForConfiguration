package springboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springboot.config.properties.SpringBootForConfigurationProperties;

@Component
public class SpringBootForCommandLiner implements CommandLineRunner { 

	private SpringBootForConfigurationProperties app;
	
	public SpringBootForCommandLiner() {
		
	}

	@Override
	public void run(String... args) throws Exception {
		app = new SpringBootForConfigurationProperties();
		System.out.println(" Dans CommandLineRunner " + app );
	}

}
