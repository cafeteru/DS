package Campos.Strategy;

public class ComprobarUbicacion extends ComprobarPredefinido {

	public ComprobarUbicacion(String... valores) {
		super(valores);
	}

	@Override
	public boolean comprobarDato(String dato) {
		boolean ciudad = super.comprobarDato(dato);
		if (!ciudad)
			return new ComprobarNumero().comprobarDato(dato)
					&& new ComprobarLongitud(3).comprobarDato(dato);
		return ciudad;
	}
}
