package orderInıt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class InitializationOrderExample {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(InitializationOrderExample.class);
	}
}

//asagıdaki outputda önce varsa injectionlı constructorı cagırdı.

//Sonraki önceliği ise field injectiona öncelik veriyor.

//en son ise metotları cagırıyor, set metotlarını.

//Output:
//	in AppConfiguration.d()
//	in BeanA(double d)

//	BeanA [s=null, i=0, b=false, beanB1=null, l=0, c= , beanB2=null, d=3.14]
//	in AppConfiguration.l()
//	in AppConfiguration.c()
//	in AppConfiguration.beanB2()
//	in BeanB(): 1
//	in BeanB(): 2
//	BeanA [s=null, i=0, b=false, beanB1=BeanB [], l=33, c=j, beanB2=BeanB [], d=3.14]
//	in AppConfiguration.i()
//	BeanA [s=null, i=3, b=false, beanB1=BeanB [], l=33, c=j, beanB2=BeanB [], d=3.14]
//	in AppConfiguration.s()
//	BeanA [s=s, i=3, b=false, beanB1=BeanB [], l=33, c=j, beanB2=BeanB [], d=3.14]
//	in AppConfiguration.b()
//	BeanA [s=s, i=3, b=true, beanB1=BeanB [], l=33, c=j, beanB2=BeanB [], d=3.14]
	