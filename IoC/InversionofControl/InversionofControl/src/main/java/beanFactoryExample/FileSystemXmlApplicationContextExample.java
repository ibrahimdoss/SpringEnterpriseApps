package beanFactoryExample;

import java.util.Arrays;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import beanFactoryExampleDomain.*;

public class FileSystemXmlApplicationContextExample {

	public static void main(String[] args) {
		loadBeans11();
//		loadBeans12(); // Couldn't find the resource file
		loadBeans2();
		loadBeans3();
		loadBeans4();
		loadBeans5();
		loadBeans6();
	}
	
	public static void loadBeans11() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
		context.setConfigLocation("file:/Users/ibrahim/Desktop/resources/beans.xml"); // Start with file: for absolute file path
		context.refresh();		//yukarıdaki file yolu örnek yoldur. burası calıstırılacagı zaman bu sekilde yol verilip calıstırılabilir.
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans12() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
		context.setConfigLocation("/Users/ibrahim/Desktop/resources/beans.xml"); // Always relative unless starting with file:
		context.refresh();		//yukarıdaki file yolu örnek yoldur. burası calıstırılacagı zaman bu sekilde yol verilip calıstırılabilir.
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans2() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/ibrahim/Desktop/resources/beans.xml");
		BeanB beanB = context.getBean(BeanB.class);	//yukarıdaki file yolu örnek yoldur. burası calıstırılacagı zaman bu sekilde yol verilip calıstırılabilir.
		System.out.println(beanB);
	}

	public static void loadBeans3() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/ibrahim/Desktop/resources/beans.xml", "file:/Users/ibrahim/Desktop/resources/anotherBeans.xml");		
		BeanD beanD = context.getBean(BeanD.class);//yukarıdaki file yolu örnek yoldur. burası calıstırılacagı zaman bu sekilde yol verilip calıstırılabilir.
		System.out.println(beanD);
	}
	
	public static void loadBeans4() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/ibrahim/Desktop/resources/beans.xml", "file:/Users/ibrahim/Desktop/resources/anotherBeans.xml");		
//		BeanC beanc = context.getBean(BeanC.class); // Problem when there are more than one bean definition. //yukarıdaki file yolu örnek yoldur. burası calıstırılacagı zaman bu sekilde yol verilip calıstırılabilir.
//		System.out.println(beanc);
		
		String[] beanNamesForBeanC = context.getBeanNamesForType(BeanC.class);
		System.out.println("\nBean definition names for type BeanC:");
		Arrays.stream(beanNamesForBeanC).forEach(System.out::println);
	}
	
	public static void loadBeans5() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/ibrahim/Desktop/resources/beans.xml", "file:/Users/ibrahim/Desktop/resources/anotherBeans.xml");		
		BeanE beanE = (BeanE) context.getBean("beanE"); // Bean and its dependencies may be in different resources.
		System.out.println(beanE);
	}
	
	public static void loadBeans6() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/ibrahim/Desktop/resources/beans.xml", "file:/Users/ibrahim/Desktop/resources/anotherBeans.xml", "file:/Users/ibrahim/Desktop/resources/yetAnotherBeans.xml");		
		BeanE beanE = (BeanE) context.getBean("beanE"); // In case of multiple config locations, later bean definitions will override ones defined in earlier loaded files. 
		System.out.println(beanE);
	}
}
