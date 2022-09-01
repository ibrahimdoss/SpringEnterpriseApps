package DependencyTypesExample;

public class A extends P implements I{
	
	private B b; //instance variable.
	
	public void f(C c) {}
	
	public D g() {
		return new D() ;}
	

}
