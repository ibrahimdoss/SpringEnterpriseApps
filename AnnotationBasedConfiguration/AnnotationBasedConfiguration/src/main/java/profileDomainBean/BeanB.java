package profileDomainBean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("PostgreSQL")
public class BeanB {
	@Override
	public String toString() {
		return "BeanB []";
	}
}
