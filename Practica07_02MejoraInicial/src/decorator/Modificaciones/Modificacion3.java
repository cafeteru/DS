package decorator.Modificaciones;

import decorator.Contar;
import decorator.Decorator;
import outputs.Output;

public class Modificacion3 extends Decorator {
	Output output;

	public Modificacion3(Output output) {
		super(output);
		output = new Contar(output);
	}

}
