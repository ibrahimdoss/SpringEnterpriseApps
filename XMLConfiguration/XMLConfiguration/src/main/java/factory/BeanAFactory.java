package factory;

import factoryDomain.BeanA;

public class BeanAFactory implements Factory{

	@Override
	public BeanA create() {
		return new BeanA();
	}
}
