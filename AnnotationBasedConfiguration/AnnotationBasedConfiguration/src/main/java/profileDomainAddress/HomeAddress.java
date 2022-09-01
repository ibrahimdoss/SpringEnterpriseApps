package profileDomainAddress;

public abstract class HomeAddress implements Address {

	@Override
	public String toString() {
		return "HomeAddress [City=" + getAddress() + "]";
	}
}
