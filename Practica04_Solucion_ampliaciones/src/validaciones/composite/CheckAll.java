package validaciones.composite;

import java.util.Arrays;
import java.util.List;

import formulario.Validation;

public class CheckAll implements Validation {

	private List<Validation> validations;

	public CheckAll(Validation... validations) {
		this.validations = Arrays.asList(validations);
	}

	public boolean isValid(String texto) {
		for (Validation validacion : validations)
			if (!validacion.isValid(texto))
				return false;
		return true;
	}
}
