package Greeting;

public class StandardOutputRenderer implements GreetingRenderer{
	private GreetingProvider greetingProvider = null;
	
	public StandardOutputRenderer() {
		System.err.println("==> in StandardOutputRenderer()");
	}

	@Override
	public void setGreetingProvider(GreetingProvider provider) {
		System.err.println("==> in setGreetingProvider()");
		this.greetingProvider = provider;
	}

	public void render() {
		String greeting = greetingProvider.getGreeting();
		System.out.println(greeting);
	}
}
