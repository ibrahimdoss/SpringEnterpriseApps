package exampleGreeting02;

public enum Notes {

	//Hangi mesajı istiyorsak geciyoruz, sonra onu argüman olarak alıyor ve o arg varsa onu print
	//edecek yoksa hello world'ü print edecek sekilde düzenledik.
	
	//Dependency açısından bakacak olursak bu exampleGreeting01 icindeki islemden daha iyi. 
	//Cünkü mesaja olan dependency'i azaltmıs olduk.
	
//	System.out.println console print ediyor, console değil de file, webservice vs başka yerlere
//	print etmek istediğimiz de dolayısıyla console olan dependency'den kurtulmamız lazım.
//	
//	Aynı zamanda System.out.println sadece print etmiyor, aynı zamanda mesajı alıyor iki şeyi bir arada
//	yapıyor.
//	
//	Mesajı almak ile, mesajı göstermek farklı sorumluluklar, bunları ayırt ettiğimiz zaman 
//	application'nun System.out.println'a olan bağımlılığını x2 azaltmıs oluruz.
//	
//	Hem applicationdan ayıralım, hem de birbirlerinden ayıralım.
	
	//TODO Bunun çözümü ise exampleGreeting03 paketi icindedir.
}
