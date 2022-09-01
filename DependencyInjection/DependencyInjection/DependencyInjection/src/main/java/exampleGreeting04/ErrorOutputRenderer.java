package exampleGreeting04;

public class ErrorOutputRenderer implements GreetingRenderer {

	// MessageProvider is Java Interface
	private GreetingProvider greetingProvider = null;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}

	@Override
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
}
