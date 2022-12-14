package lifecycleCallbackExampleDomain3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanE {

	private BeanF beanF;

	@Autowired
	public void setBeanD(BeanF beanF) {
		this.beanF = beanF;
	}

	@Override
	public String toString() {
		return "BeanE [beanF=" + beanF + "]";
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanE init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanE shutDown()");
	}
}
