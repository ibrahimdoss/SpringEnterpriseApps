package greeting17Provider;

import org.springframework.stereotype.Component;

import greeting17Custom.Selam;

@Selam
public class SelamGreetingProvider implements GreetingProvider{
	
	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
