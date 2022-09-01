package orderDomain;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HighestOrderBean implements MyBean{
	
	public HighestOrderBean() {
		System.err.println("in HighestOrderBean()");
	}
}
