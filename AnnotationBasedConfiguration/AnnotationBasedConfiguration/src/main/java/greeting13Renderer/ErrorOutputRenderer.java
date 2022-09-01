package greeting13Renderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greeting13Provider.GreetingProvider;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Autowired
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}
