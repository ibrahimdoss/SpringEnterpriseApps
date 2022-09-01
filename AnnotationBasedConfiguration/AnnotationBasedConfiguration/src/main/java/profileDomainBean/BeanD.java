package profileDomainBean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("MySQL & PostgreSQL")
public class BeanD {

	@Override
	public String toString() {
		return "BeanD []";
	}
}
