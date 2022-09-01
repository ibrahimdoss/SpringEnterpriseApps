package dependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import dependsOnDomain.ABean;

@ComponentScan
public class DependsOnExample{
	

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DependsOnExample.class);

		ABean aBean = (ABean) context.getBean("aBean");

	}
}

//Run it without and with @DependsOn on ABean
