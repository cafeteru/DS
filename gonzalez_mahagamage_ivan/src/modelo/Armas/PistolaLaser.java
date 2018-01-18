package modelo.Armas;

/**
 * Como este arma no tiene municion, no es como el resto, implementa
 * directamente el interfaz Arma, deja vacios los métodos que se refieren a la
 * munición.
 * 
 * Este un EstadoConcreto del patrón State Es la ClaseAbstracta del patrón
 * Template. Es una hoja en el patrón Composite.
 * 
 * @author uo239795
 *
 */
public class PistolaLaser implements Arma {

	@Override
	public void disparar() {
		System.out.println("Se mueve en linea recta");
	}

	@Override
	public void recargar() {
		System.out.println("No recargo");

	}

	@Override
	public void mover() {
		System.out.println("Se mueve recto.");
	}

	@Override
	public void dibujar() {
	}

	@Override
	public void borrar() {
	}

	@Override
	public String toString() {
		return "pistola láser.";
	}

}
