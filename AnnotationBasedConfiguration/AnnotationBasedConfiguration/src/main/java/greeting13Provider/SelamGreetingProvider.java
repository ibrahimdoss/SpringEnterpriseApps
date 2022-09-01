package greeting13Provider;

import org.springframework.stereotype.Component;

@Component
public class SelamGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
