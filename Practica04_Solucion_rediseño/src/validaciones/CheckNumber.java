package validaciones;

import formulario.Validation;

public class CheckNumber implements Validation {

	public boolean isValid(String texto) {
		for (char ch : texto.toCharArray())
			if (!Character.isDigit(ch))
				return false;
		return true;
	}
}
