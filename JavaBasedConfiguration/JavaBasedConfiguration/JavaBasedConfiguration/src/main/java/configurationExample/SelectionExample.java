package configurationExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import configurationDomain.BeanD;

@ComponentScan(basePackageClasses={configurationConf.Configuration4.class})
public class SelectionExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SelectionExample.class);
		 BeanD beanD = context.getBean(BeanD.class);	
		 System.out.println(beanD);
	}
}
