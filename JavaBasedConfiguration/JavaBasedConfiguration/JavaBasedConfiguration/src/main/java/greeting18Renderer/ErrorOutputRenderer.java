package greeting18Renderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greeting18Custom.Hello;
import greeting18Provider.GreetingProvider;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Autowired
	@Hello
	private GreetingProvider helloWorldGreetingProvider;

	@Override
	public void render() {
		System.err.println(helloWorldGreetingProvider.getGreeting());
	}
}
