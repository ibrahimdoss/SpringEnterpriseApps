package processorBeanPostProcessorConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public String name() {
		return "A_NAME";
	}

}
