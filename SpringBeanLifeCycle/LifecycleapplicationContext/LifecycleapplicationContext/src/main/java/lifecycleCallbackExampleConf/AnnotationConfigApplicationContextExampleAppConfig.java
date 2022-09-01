package lifecycleCallbackExampleConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lifecycleCallbackExampleDomain3.*;

@Configuration
public class AnnotationConfigApplicationContextExampleAppConfig {

	@Bean
	public BeanE beanE() {
		return new BeanE();
	}

	@Bean
	public BeanF beanF() {
		return new BeanF();
	}

	@Bean
	public String name() {
		return "Bean_E";
	}
}
