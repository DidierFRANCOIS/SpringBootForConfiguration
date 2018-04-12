package springboot.config.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springboot.config.properties.SpringBootForConfigurationProperties;

@Component
public class SpringBootForConfigurationShowProperties {

	@Autowired
	  private SpringBootForConfigurationProperties springBootForConfigurationProperties;

	  public void print() {
		  System.out.println( springBootForConfigurationProperties.toString() );
	  }
	
	
}
