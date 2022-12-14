package ValueInjection.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelBeanExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/spel/resources/beans.xml");

		SpelBean bean = (SpelBean) context.getBean("spelBean");
		System.out.println(bean);
	}

}
