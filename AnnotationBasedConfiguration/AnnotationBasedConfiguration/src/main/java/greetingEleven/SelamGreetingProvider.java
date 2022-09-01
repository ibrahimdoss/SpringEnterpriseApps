package greetingEleven;

public class SelamGreetingProvider implements GreetingProvider{
	private String greeting;

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
