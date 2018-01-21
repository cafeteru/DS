package validaciones.composite;

import java.util.Arrays;
import java.util.List;

import formulario.Validation;

public class CheckAny implements Validation {

	private List<Validation> validations;

	public CheckAny(Validation... validations) {
		this.validations = Arrays.asList(validations);
	}

	public boolean isValid(String texto) {
		for (Validation validacion : validations)
			if (validacion.isValid(texto))
				return true;
		return false;
	}
}
