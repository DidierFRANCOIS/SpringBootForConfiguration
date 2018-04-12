// Cette intercepte tous les evenements emises par l'application SpringBoot.
// Elle est déclarée dans les listeners de l'application SpringBoot.

package springboot.config.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class HelloApplicationListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(" Event reçu par l'application springBoot :  " + event.getClass().getName());
	}

}