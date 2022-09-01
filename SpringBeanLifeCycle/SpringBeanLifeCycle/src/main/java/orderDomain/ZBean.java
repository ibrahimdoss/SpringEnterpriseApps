package orderDomain;

import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component("zBean")
@Order(1)
public class ZBean implements MyBean{
	
	public ZBean() {
		System.err.println("in ZBean()");
	}
}
