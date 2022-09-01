package orderDomain;


import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component("aBean")
@Order(100)
//@DependsOn("zBean")
public class ABean implements MyBean{
	
	public ABean() {
		System.err.println("in ABean()");
	}
}
