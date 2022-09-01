package injectDomain;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
	
	@Inject
	private double pi;
	
	@Inject
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	@Override
	public String toString() {
		return "BeanA [pi=" + pi + "beanB=" + beanB + "]";
	}


	
}
