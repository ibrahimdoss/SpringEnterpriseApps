package orderInıtDomain;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
	private static int count;
	
	public BeanB() {
		count++;
		System.err.println("in BeanB(): " + count);
	}

	@Override
	public String toString() {
		return "BeanB []";
	}
}
