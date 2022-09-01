package orderDomain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component
@Order(200)
public class HigherOrderBean implements MyBean{
	
	public HigherOrderBean() {
		System.err.println("in HigherOrderBean()");
	}
}
