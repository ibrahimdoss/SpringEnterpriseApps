package orderDomain;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import order.MyBean;

@Component("xBean1")
//@Order(2)
public class XBean1 implements MyBean, Ordered{
	
	public XBean1() {
		System.err.println("in XBean1()");
	}

	@Override
	public int getOrder() {
		return 2;
	}
}
