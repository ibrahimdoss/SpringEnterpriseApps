package greetingEleven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {
		getBean1();
//		getBean2();
	}

	public static void getBean1() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"greetingElevenResources/beans1.xml");

		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer");
		renderer.render();
	}

	public static void getBean2() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"greetingElevenResources/beans2.xml");

		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer");
		renderer.render();
	}
}
