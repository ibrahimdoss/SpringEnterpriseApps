package orderDomain;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import org.springframework.stereotype.Component;

import order.MyBean;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class LowestOrderBean implements MyBean{
	
	public LowestOrderBean() {
		System.err.println("in LowestOrderBean()");
	}
}
