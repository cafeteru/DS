package Campos.Strategy;

public class ComprobarSueldo implements Comprobador {

	@Override
	public boolean comprobarDato(String dato) {
		boolean numero = new ComprobarNumero().comprobarDato(dato);
		if (numero) {
			int sueldo = Integer.parseInt(dato);
			return sueldo >= 800 && sueldo <= 1200;
		}
		return numero;
	}
}
