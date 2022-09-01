package appRenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greetingEleven.GreetingProvider;

@Component(value="renderer") //This is the same as @Component(value="renderer")
public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider;

	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
