package qualifierCustomDomain;

import org.springframework.stereotype.Component;

import qualifierCustomQualifiers.Home;

@Component
@Home(city = "Istanbul")
public class IstanbulAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Istanbul";
	}
}
