package injectionValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.CustomValueInjection;

public class CustomValueInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch03/bean/resources/customValue.xml");
		
		CustomValueInjection vi1 = (CustomValueInjection) context.getBean("customValueInjection");
		System.out.println(vi1);
		
	}
}
