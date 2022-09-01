package applicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import applicationContextDomain1.*;
import applicationContextDomain2.*;

//@ComponentScan({"org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1", "org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain2"})
@Import(AppConfiguration2.class)
public class AnnotationConfigApplicationContextExample1 {
	
	public static void main(String[] args) {
//		getBeans1();
		getBeans2();
	}
	
	public static void getBeans1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExample1.class);
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
		BeanE beanE = (BeanE) context.getBean("beanE");
		System.out.println(beanE);
	}
	
	public static void getBeans2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExample1.class);
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
	}
}
