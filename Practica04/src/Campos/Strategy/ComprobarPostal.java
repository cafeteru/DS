package Campos.Strategy;

public class ComprobarPostal implements Comprobador {

	@Override
	public boolean comprobarDato(String dato) {
		boolean numero = new ComprobarNumero().comprobarDato(dato);
		if (numero)
			return new ComprobarLongitud(5).comprobarDato(dato);
		return numero;
	}

}
