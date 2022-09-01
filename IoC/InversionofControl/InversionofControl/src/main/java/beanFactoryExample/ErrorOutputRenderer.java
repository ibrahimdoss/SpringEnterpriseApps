package beanFactoryExample;

import IocHistoryExample.GreetingProvider;
import IocHistoryExample.GreetingRenderer;

public class ErrorOutputRenderer implements GreetingRenderer {
	
	private GreetingProvider greetingProvider = null;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}

	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
}
