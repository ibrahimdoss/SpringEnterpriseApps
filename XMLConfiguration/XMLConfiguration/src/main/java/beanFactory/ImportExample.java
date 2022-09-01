package beanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.BeanA;

public class ImportExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch03/beanFactory/resources/importedBeans.xml");		
		
		BeanA beanA = (BeanA) context.getBean("beanA"); 
		System.out.println(beanA);
		
	}
}
