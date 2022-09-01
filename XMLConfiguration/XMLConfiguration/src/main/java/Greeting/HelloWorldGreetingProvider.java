package Greeting;

public class HelloWorldGreetingProvider implements GreetingProvider {
	
	public HelloWorldGreetingProvider() {
		System.err.println("==> in HelloWorldGreetingProvider()");
	}

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
