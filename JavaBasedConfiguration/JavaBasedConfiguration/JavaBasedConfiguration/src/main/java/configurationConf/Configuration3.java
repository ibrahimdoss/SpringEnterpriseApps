package configurationConf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import configurationDomain.*;

//@Configuration
public class Configuration3 {
	
	public Configuration3() {
		System.out.println("==> Configuration3()");
	}
	
	@Bean
	public BeanA getBeanA() {
		return new BeanA();
	}
	
	@Bean
	public BeanB getBeanB(String name, int age) {
		return new BeanB(name, age);
	}
	
	@Bean
	public BeanC getBeanC() {
		return new BeanC();
	}
	
	@Bean
	public String name() {
		return "Yasemin";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public String nameOfBean() {
		return "BEAN-C";
	}
}
