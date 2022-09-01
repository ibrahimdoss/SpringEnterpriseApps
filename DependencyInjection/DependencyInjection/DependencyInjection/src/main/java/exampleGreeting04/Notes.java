package exampleGreeting04;

public enum Notes {
	
	//Depend on Abstractions
	//dependencyleri abstraction seviyesine cekmek.
	
//	Burada GreetingRenderer renderer = new StandardOutputRenderer();
//
//	GreetingProvider helloGreetingProvider = new HelloWorldGreetingProvider();
//	
//	yukarıdaki sekilde sol tarafı soyutlayıp sorumlulukları düzenledik ama bu sefer obje olusturma kısmı
//	yani sağ tarafı da düzeltmemiz lazım ama tabi ki daha iyi bir durumda .
	
	
	//Çünkü hala obje olusturma kısmı application üzerinde 
	
	//TODO Bunun çözümü exampleGreeting05 de.
	
	//Burada dolayısıyla application üzerinden create etme sorumluluğu alınmadığı icin tam anlamıyla
	//soyut dependency diyemiyoruz.
	

}
