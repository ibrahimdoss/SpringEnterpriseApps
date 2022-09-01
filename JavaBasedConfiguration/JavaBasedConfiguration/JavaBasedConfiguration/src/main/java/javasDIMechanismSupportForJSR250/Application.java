package javasDIMechanismSupportForJSR250;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javasDIMechanismSupportForJSR250Renderer.GreetingRenderer;

@ComponentScan(basePackages={"org.javaturk.spring.di.ch07.greeting.greeting19"})
public class Application {

	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();
		
		renderer1 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer1.render();
	}
}
