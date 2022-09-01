package applicationContextDomain2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import applicationContextDomain1.BeanD;

@Component
public class BeanE {

	private BeanD beanD;

	@Autowired
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	@Override
	public String toString() {
		return "BeanE [beanD=" + beanD + "]";
	}
}
