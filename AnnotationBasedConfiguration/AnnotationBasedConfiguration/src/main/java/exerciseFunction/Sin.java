package exerciseFunction;

public class Sin implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}

	@Override
	public String getName() {
		return "sin";
	}
}
