package applicationContextDomain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
	
	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}
