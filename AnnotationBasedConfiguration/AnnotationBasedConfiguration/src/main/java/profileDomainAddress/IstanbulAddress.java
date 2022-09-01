package profileDomainAddress;

import org.springframework.stereotype.Component;

@Component
public class IstanbulAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Istanbul";
	}
}
