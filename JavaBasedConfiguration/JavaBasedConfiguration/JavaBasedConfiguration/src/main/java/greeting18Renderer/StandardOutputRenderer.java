package greeting18Renderer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greeting18Custom.Selam;
import greeting18Provider.GreetingProvider;

@Component
public class StandardOutputRenderer implements GreetingRenderer {

	@Autowired
	@Selam
	private GreetingProvider selamGreetingProvider;

//	@Autowired
//	public void setGreetingProvider(GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setHelloWorldGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}

	public void render() {
		System.out.println(selamGreetingProvider.getGreeting());
	}
}
