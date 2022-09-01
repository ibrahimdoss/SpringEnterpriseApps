package processorBeanPostProcessor;

import java.time.LocalDateTime;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import processorDomain.*;


public class MyBeanPostProcessor1 implements BeanPostProcessor{
	
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 if (beanName.equals("beanA")) {
			 BeanA beanA = (BeanA) bean;
			 System.out.println("in postProcessBeforeInitialization(): " + beanA.getName());
			 beanA.setPreInitializationDate(LocalDateTime.now());
		 }
		return bean;
	}

	 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 if (beanName.equals("beanA")) {
			 BeanA beanA = (BeanA) bean;
			 System.out.println("in postProcessAfterInitialization(): " + beanA.getName());
			 beanA.setPostInitializationDate(LocalDateTime.now());
		 }
		return bean;
	}
}
