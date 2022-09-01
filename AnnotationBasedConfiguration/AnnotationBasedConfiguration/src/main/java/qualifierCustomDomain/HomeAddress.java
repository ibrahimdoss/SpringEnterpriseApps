package qualifierCustomDomain;

public abstract class HomeAddress implements Address {

	@Override
	public String toString() {
		return "HomesAddress [City=" + getAddress() + "]";
	}
}
