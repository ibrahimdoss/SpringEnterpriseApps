package javasDIMechanismSupportForJSR250Renderer;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javasDIMechanismSupportForJSR250Provider.GreetingProvider;

@Component
public class StandardOutputRenderer implements GreetingRenderer {

	@Resource
	@Qualifier("selam")
//	@Selam
	private GreetingProvider greetingProvider;

//	@Autowired
//	@Resource
//	@Qualifier("selam")
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
	
//	@Autowired
//	public void setHelloWorldGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
