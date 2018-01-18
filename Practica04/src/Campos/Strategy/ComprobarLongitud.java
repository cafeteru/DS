package Campos.Strategy;

public class ComprobarLongitud implements Comprobador {
	int tamaño;

	public ComprobarLongitud(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public boolean comprobarDato(String dato) {
		if (dato.length() == tamaño)
			return true;
		return false;
	}
}