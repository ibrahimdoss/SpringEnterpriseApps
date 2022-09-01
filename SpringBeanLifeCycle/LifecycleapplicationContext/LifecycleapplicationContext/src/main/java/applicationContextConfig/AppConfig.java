package applicationContextConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import applicationContextDomain1.BeanC;

@Configuration
public class AppConfig {
	
	@Bean
	public String name() {
		return "A-NEW-NAME";
	}
	
	@Bean
	public BeanC beanC() {
		return new BeanC();
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in AppConfig init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in AppConfig shutDown()");
	}

}
