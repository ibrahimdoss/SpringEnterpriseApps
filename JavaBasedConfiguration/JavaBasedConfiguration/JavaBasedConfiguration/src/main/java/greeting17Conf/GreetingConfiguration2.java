package greeting17Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import greeting17Provider.GreetingProvider;
import greeting17Provider.HelloWorldGreetingProvider;
import greeting17Provider.SelamGreetingProvider;
import greeting17Renderer.ErrorOutputRenderer;
import greeting17Renderer.GreetingRenderer;
import greeting17Renderer.StandardOutputRenderer;


//@Configuration
public class GreetingConfiguration2 {
	
	public GreetingConfiguration2() {
		System.out.println("==> GreetingConfiguration2()");
	}
	
	@Bean("selamGreetingProvider")
	public GreetingProvider getSelamGreetingProvider() {
		return new SelamGreetingProvider();
	}
	
	@Bean("helloWorldGreetingProvider")
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
