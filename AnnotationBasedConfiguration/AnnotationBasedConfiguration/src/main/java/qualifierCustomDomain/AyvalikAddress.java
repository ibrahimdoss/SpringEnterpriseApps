package qualifierCustomDomain;

import org.springframework.stereotype.Component;

import qualifierCustomQualifiers.Home;

@Component
@Home(city = "Ayvalik")
public class AyvalikAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Ayvalik";
	}
}
