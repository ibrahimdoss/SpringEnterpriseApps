package greeting17Provider;

import org.springframework.stereotype.Component;

import greeting17Custom.Hello;

@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
