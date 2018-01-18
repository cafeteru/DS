package Campos.Strategy;

public class ComprobarNumero implements Comprobador {

	@Override
	public boolean comprobarDato(String dato) {
		for (char ch : dato.toCharArray()) {
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

}
