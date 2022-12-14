package applicationContextLifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import applicationContextConfig.AppConfig;

@ComponentScan({"org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.domain", "org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.processor"})
@Import(AppConfig.class)
public class ApplicationContextLifecycleExample {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextLifecycleExample.class);
		System.out.println();
		context.close();
	}

	@Override
	public String toString() {
		return "ApplicationContextLifecycleExample []";
	}
}
