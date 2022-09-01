package liteBeanDomainC;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanE {
	private String name;
	private int number;
	
	public BeanE(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "BeanE [name=" + name + ", number=" + number + "]";
	}
}
