package javasDIMechanismSupportForJSR250Renderer;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javasDIMechanismSupportForJSR250Provider.GreetingProvider;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Resource
	@Qualifier("hello")
//	@Hello
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}
