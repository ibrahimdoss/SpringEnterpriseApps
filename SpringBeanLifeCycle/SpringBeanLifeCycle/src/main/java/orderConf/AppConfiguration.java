package orderConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import orderDomain.YBean;

@Configuration
public class AppConfiguration {
	
	@Bean
	@Order(-100)
	public YBean yBean() {
		return new YBean();
	}
}
