package qualifierCustomApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import qualifierCustomDomain.Person;

public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/qualifier/custom/resources/beans.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
}
