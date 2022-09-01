package greeting17Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import greeting17Provider.*;
import greeting17Renderer.*;


//@Configuration
public class GreetingConfiguration1 {

	public GreetingConfiguration1() {
		System.out.println("==> GreetingConfiguration1()");
	}

	@Bean
	public GreetingProvider selamGreetingProvider() {
		return new SelamGreetingProvider();
	}

	@Bean
	public GreetingProvider helloWorldGreetingProvider() {
		return new HelloWorldGreetingProvider();
	}

	@Bean
	public GreetingRenderer standardOutputRenderer() {
		return new StandardOutputRenderer();
	}

	@Bean
	public GreetingRenderer errorOutputRenderer() {
		return new ErrorOutputRenderer();
	}
}
