package greeting18Provider;

import org.springframework.stereotype.Component;

import greeting18Custom.Selam;

@Component
@Selam
public class SelamGreetingProvider implements GreetingProvider{
	
	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
