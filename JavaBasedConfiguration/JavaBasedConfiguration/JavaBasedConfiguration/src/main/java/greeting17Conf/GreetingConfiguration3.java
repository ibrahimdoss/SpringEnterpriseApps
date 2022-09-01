package greeting17Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import greeting17Provider.GreetingProvider;
import greeting17Provider.HelloWorldGreetingProvider;
import greeting17Provider.SelamGreetingProvider;
import greeting17Renderer.ErrorOutputRenderer;
import greeting17Renderer.GreetingRenderer;
import greeting17Renderer.StandardOutputRenderer;

@Configuration
public class GreetingConfiguration3 {
	
	public GreetingConfiguration3() {
		System.out.println("==> GreetingConfiguration3()");
	}
	
	@Bean
	public GreetingProvider getSelamGreetingProvider() {
		return new SelamGreetingProvider();
	}
	
	@Bean
	public GreetingProvider getHelloWorldGreetingProvider() {
		return new HelloWorldGreetingProvider();
	}

	@Bean("standardOutputRenderer")
	public GreetingRenderer getStandardOutputRenderer() {
		return new StandardOutputRenderer();
	}
	
	@Bean("errorOutputRenderer")
	public GreetingRenderer getErrorOutputRenderer() {
		return new ErrorOutputRenderer();
	}
}
