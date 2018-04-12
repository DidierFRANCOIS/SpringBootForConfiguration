// Pas de constructeur sur la classe. 
// 
package springboot.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mesProprietes.properties")
@ConfigurationProperties(prefix="myApp")
public  class SpringBootForConfigurationProperties {

    private String host;
        
    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	@Override
    public String toString() {
        return " host='" + host + '}';
    }
    
    
}
