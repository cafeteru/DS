package modelo.Armas;

/**
 * Para mejor el diseño de las arma he usado el patrón State, ya que dependiendo
 * de cada arma, realizan las acciones de una manera distinta y no tienen porque
 * saberlo el jugador.
 * 
 * Este el Estado en el patrón State. Es el Componente en el patrón Composite.
 * 
 * @author uo239795
 *
 */
public interface Arma {
	public void disparar();

	public void recargar();

	public void mover();

	void dibujar();

	void borrar();
}
