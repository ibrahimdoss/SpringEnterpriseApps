package appProvider;

import org.springframework.stereotype.Component;

@Component("greetingProvider")
public interface GreetingProvider {
	
	public String getGreeting();
}
