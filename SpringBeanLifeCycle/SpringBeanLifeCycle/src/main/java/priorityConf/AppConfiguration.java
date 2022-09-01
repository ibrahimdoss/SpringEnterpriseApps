package priorityConf;

import javax.annotation.Priority;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import priorityDomain.YBean;

//@Configuration
public class AppConfiguration {
	
	@Bean
	@Order(-100)
//	@Priority
	public YBean yBean() {
		return new YBean();
	}
}
