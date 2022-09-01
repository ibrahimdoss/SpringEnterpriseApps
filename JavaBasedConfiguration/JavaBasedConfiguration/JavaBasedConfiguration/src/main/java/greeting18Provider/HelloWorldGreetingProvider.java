package greeting18Provider;

import org.springframework.stereotype.Component;

import greeting18Custom.Hello;

@Component
@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
