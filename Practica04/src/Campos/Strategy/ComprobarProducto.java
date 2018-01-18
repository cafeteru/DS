package Campos.Strategy;

public class ComprobarProducto implements Comprobador {

	@Override
	public boolean comprobarDato(String dato) {
		return new ComprobarLongitud(4).comprobarDato(dato);
	}

}
