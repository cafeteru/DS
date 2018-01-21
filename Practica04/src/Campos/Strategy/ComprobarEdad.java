package Campos.Strategy;

public class ComprobarEdad implements Comprobador {

	@Override
	public boolean comprobarDato(String dato) {
		boolean numero = new ComprobarNumero().comprobarDato(dato);
		if (numero)
			return Integer.parseInt(dato) >= 18;
		return numero;
	}
}
