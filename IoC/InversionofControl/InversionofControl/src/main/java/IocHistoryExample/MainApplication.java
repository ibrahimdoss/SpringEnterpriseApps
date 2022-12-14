package IocHistoryExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic: Property (setter) injection.
 * 
 * Make use of Spring framework to create renderer and message provider objects.
 * It uses BeanFactory class and beans1.xml. It injects the message provider
 * object into the setter of the message renderer.
 */
public class MainApplication {

	public static void main(String[] args) throws Exception {

		BeanFactory factory = new ClassPathXmlApplicationContext(
				"IocHistoryExample/resources/beans1.xml");
		GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer");
		renderer.render();

		//GreetingProvider provider = (GreetingProvider) factory.getBean("provider");
	//	System.out.println(provider.getGreeting());
	}
}
