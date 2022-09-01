package qualifierCustomDomain;

import org.springframework.stereotype.Component;

import qualifierCustomQualifiers.Office;

@Component
@Office(city = "Istanbul")
public class OfficeAddress implements Address {

	@Override
	public String getAddress() {
		return "Istanbul";
	}
	
	@Override
	public String toString() {
		return "OfficeAddress [City=" + getAddress() + "]";
	}
}
