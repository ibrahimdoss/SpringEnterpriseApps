package greetingEleven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class StandardOutputRenderer implements GreetingRenderer {

//	@Autowired
	private GreetingProvider greetingProvider; //instance variable olarak inject
	
	public StandardOutputRenderer() {
		System.out.println("in StandardOutputRenderer");
	}

	@Autowired
	public StandardOutputRenderer(GreetingProvider greetingProvider) { //constructor inject
		System.out.println("in StandardOutputRenderer(GreetingProvider)");
		this.greetingProvider = greetingProvider;
	}
	
	@Autowired
	public StandardOutputRenderer(GreetingProvider greetingProvider, GreetingProvider greetingProvider2) {
		System.out.println("in StandardOutputRenderer(GreetingProvider)");
		this.greetingProvider = greetingProvider;
	}

	
	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) { //setter method inject.
		System.out.println("in setGreetingProvider()");
		this.greetingProvider = greetingProvider;
	}
	
//	@Autowired
	public void setHelloWorldGreetingProvider(HelloWorldGreetingProvider helloWorldGreetingProvider) {
		System.out.println("in setHelloWorldGreetingProvider()");
		this.greetingProvider = helloWorldGreetingProvider;
	}

//	@Autowired
//	public void f(GreetingProvider greetingProvider) { //any method inject.
//		System.out.println("in f()");
//		this.greetingProvider = greetingProvider;
//	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
