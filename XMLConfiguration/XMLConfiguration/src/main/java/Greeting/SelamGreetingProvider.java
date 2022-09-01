package Greeting;

public class SelamGreetingProvider implements GreetingProvider{
	
	public SelamGreetingProvider() {
		System.err.println("==> in SelamGreetingProvider()");
	}
	
	public String getGreeting() {
		return "Selam :)";
	}
}
