package applicationContext;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import applicationContextDomain1.*;

@Configuration
public class AppConfiguration2 {
	
	@Bean()
	public BeanA beanA() {
		return new BeanA();
	}
	
	@Bean()
	public BeanB beanB() {
		return new BeanB();
	}
	
	@Bean
	public BeanC beanC() {
		return new BeanC();
	}

}
