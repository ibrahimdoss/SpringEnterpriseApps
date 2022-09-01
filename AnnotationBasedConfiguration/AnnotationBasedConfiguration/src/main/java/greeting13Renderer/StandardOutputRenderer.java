package greeting13Renderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greeting13Provider.GreetingProvider;

@Component
public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider;
	
	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
	
//	@Autowired
	public void setHelloWorldGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
