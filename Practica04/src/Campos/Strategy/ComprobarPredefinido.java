package Campos.Strategy;

public class ComprobarPredefinido implements Comprobador {
	private String[] valores;

	public ComprobarPredefinido(String... valores) {
		this.valores = valores;
	}

	@Override
	public boolean comprobarDato(String dato) {
		for (String valor : valores)
			if (dato.toLowerCase().equals(valor.toLowerCase()))
				return true;
		return false;
	}

}
