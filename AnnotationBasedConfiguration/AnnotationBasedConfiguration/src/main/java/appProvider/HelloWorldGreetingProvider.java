package appProvider;

import org.springframework.stereotype.Component;

//@Component
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
