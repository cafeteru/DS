package validaciones;

import validaciones.composite.CheckAll;

public class CheckCodigoPostal extends CheckAll {

	public CheckCodigoPostal() {
		super(new CheckNumber(), new CheckLength(5));
	}
}
