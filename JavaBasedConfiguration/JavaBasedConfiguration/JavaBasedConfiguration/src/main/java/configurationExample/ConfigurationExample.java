package configurationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configurationConf.*;
import configurationDomain.*;

@ComponentScan(basePackageClasses={configurationConf.Configuration1.class})
//@ComponentScan(basePackages={"configurationConf"})
//@ComponentScan
@Import({configurationConf.Configuration1.class, configurationConf.Configuration2.class, configurationConf.Configuration3.class})
public class ConfigurationExample {
	public static void main(String[] args) {
//		loadConfiguration10();
//		loadConfiguration11();
//		loadConfiguration2();
//		loadConfiguration3();
		checkSingleton();
	}
	
	private static void checkSingleton() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configurationConf");
		 BeanA beanA1 = context.getBean(BeanA.class);	
		 BeanA beanA2 = context.getBean(BeanA.class);
		 if(beanA1 == beanA2)
			 System.out.println("Singleton");
		 else
			 System.out.println("Prototype");
	}

	public static void loadConfiguration10() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 context.register(Configuration1.class); // No need to use @Configuration
		 context.refresh();
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
	
	/**
	 * Uses beans.xml
	 */
	public static void loadConfiguration11() {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurationResources/beans.xml");
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
	
	public static void loadConfiguration2() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configurationConf");
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
	
	public static void loadConfiguration3() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationExample.class);
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
}
