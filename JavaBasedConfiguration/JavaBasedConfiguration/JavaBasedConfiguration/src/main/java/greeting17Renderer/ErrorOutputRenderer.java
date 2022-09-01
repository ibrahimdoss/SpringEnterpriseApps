package greeting17Renderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greeting17Custom.Hello;
import greeting17Provider.GreetingProvider;

public class ErrorOutputRenderer implements GreetingRenderer {

	@Autowired
	@Hello
	private GreetingProvider helloWorldGreetingProvider;

	@Override
	public void render() {
		System.err.println(helloWorldGreetingProvider.getGreeting());
	}
}
