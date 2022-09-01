package lifecycleCallbackAnnotation;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;

import lifecycleCallbackAnnotationDomain.*;

@Configuration
public class AppConfiguration {
	
	@Bean(initMethod = "startUp", destroyMethod = "cleanUp")
	public BeanA beanA() {
		return new BeanA();
	}
	
	@Bean(initMethod = "startUp", destroyMethod = "cleanUp")
	public BeanB beanB() {
		return new BeanB();
	}
	
	@Bean(initMethod = "startUp", destroyMethod = "cleanUp")
	public BeanC beanC() {
		return new BeanC();
	}
	
	@Bean(destroyMethod = "")
	public BeanD beanD() {
		return new BeanD();
	}
}
