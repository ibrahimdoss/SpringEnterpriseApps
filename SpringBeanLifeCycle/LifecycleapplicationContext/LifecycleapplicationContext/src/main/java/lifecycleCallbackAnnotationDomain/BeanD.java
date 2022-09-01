package lifecycleCallbackAnnotationDomain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanD {
	
//	public void close() {
//		System.err.println("in BeanD close()");
//	}
	
	public void shutdown() {
		System.err.println("in BeanD shutdown()");
	}	
}
