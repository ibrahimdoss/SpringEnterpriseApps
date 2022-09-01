package liteBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import liteBeanDomainA.BeanA;
import liteBeanDomainB.BeanB;
import liteBeanDomainC.BeanD;

@ComponentScan("org.javaturk.spring.di.ch07.liteBean.domain.b")
public class LiteBeanExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LiteBeanExample.class);
//		getBeans1(context);
//		getBeans2(context);
//		getBeans3(context);
	}
	
	/**
	 * Use: @ComponentScan("org.javaturk.spring.di.ch07.liteBean.domain.a")
	 * @param context
	 */
	public static void getBeans1(AnnotationConfigApplicationContext context) {
		BeanA beanA = context.getBean(BeanA.class);
		System.out.println(beanA);
	}
	
	/**
	 * Use: @ComponentScan("org.javaturk.spring.di.ch07.liteBean.domain.b")
	 * @param context
	 */
	public static void getBeans2(AnnotationConfigApplicationContext context) {
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	/**
	 * Use: @ComponentScan("org.javaturk.spring.di.ch07.liteBean.domain.c")
	 * @param contex
	 */
	public static void getBeans3(AnnotationConfigApplicationContext context) {
		BeanD beanD = context.getBean(BeanD.class);
		System.out.println(beanD);
	}
}
