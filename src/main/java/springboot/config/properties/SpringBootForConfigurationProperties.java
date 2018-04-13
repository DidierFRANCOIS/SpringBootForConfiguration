// Pas de constructeur sur la classe. 
package springboot.config.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mesProprietes.properties")
@ConfigurationProperties(prefix="myapp")
public  class SpringBootForConfigurationProperties {

	final static Logger logger = LoggerFactory.getLogger(SpringBootForConfigurationProperties.class);
	
    private String host;
        
    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	@Override
    public String toString() {
		logger.debug("Debug " + host);
        return " host='" + host + '}';
    }
    
    
}
