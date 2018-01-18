package modelo.tiposProyectil;

/**
 * Para los proyectiles he usado el patrón Strategy, ya que cada arma (menos la
 * pistola láser) usa un tipo de municion diferente pero al final todas usan
 * municion.
 * 
 * Es la estrategia base del patrón Strategy.
 * 
 * @author uo239795
 *
 */
public interface Proyectil {
	public void dibujar();

	public void mover();
}
