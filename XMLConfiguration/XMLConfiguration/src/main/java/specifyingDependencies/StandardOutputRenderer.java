package specifyingDependencies;

public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider = null;

	public StandardOutputRenderer(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		if (greetingProvider == null) {
			throw new RuntimeException("You must set the property greetingProvider of class:"
					+ StandardOutputRenderer.class.getName());
		}
		System.out.println(greetingProvider.getGreeting());
	}
}
