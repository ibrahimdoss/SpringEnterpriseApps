package exampleGreeting03;

public enum Notes {
	
	//TODO ***** Bunun çözümü exampleGreeting04 paketi icindedir.
	
	
//	Seperating Responsibilities = sorumlulukları ayırma.
//			
//	Sadece mesajları print eden bir yapı, bi de sadece mesajları alan bir sistem olsa 
//	bu ikisinin objesini oluşturup  rendera helloworldü geçersek daha iyi bir yöntem olabilir.
//	
//	Bu sistemde sorumlulukları ayırmıs olduk, mesajı alan ve print eden iki farklı yapı olusturduk.
	
	
//	Burada problem hala devam ediyor. Bütün dependency'ler burada concrete yani somut class üzerinde
//	dependencyler Solidin DIP kuralına göre dependecy'ler concrete yapılar arasında değil daima 
//	soyut yapılar arasında olmalı. 
//	
//	Do not depend on concretions, depend on abstractions.
//	
//	Yüksek seviyeli yapılar alt seviyeli yapılara bağımlı olmamalılar.
//	Yüksek seviye yapılarda alt seviyeli yapılarda interfacelere bağımlı olmalı. Çünkü parçalar 
//	daha rahat hareket edebilsin diye.
	
	//Yani buradaki örnekte application, interfaceleri bilmeli, classları bilmemeli aynı zamanda 
	//StandardOutputRenderer aynı sekilde interfaceleri bilmeli, classları bilmemeli.

}
