package orderDomain;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component
@Order(1000)
public class LowerOrderBean implements MyBean{
	
	public LowerOrderBean() {
		System.err.println("in LowerOrderBean()");
	}
}
