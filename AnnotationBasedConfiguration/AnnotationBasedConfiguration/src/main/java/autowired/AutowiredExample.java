package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiredDomain.BeanA;

public class AutowiredExample {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/autowired/resources/beans.xml");

		BeanA beanA = context.getBean(BeanA.class);
		System.out.println(beanA);
	}

}
