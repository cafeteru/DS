package Campos.Strategy;

public class ComprobarTexto implements Comprobador {

	@Override
	public boolean comprobarDato(String dato) {
		for (char ch : dato.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}

}
