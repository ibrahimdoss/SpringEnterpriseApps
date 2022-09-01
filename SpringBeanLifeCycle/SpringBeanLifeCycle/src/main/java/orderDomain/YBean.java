package orderDomain;

import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component("yBean")
@Order(1)
public class YBean implements MyBean{
	
	public YBean() {
		System.err.println("in YBean()");
	}
}
