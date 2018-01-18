package modelo.Armas;

import modelo.Proyectiles;

/**
 * En esta clase además de implementar el patrón State, uso también el patrón
 * Template, porque delego en subclases como deben disparar y recargar pero
 * todas tienen un cargador y este disminuye cuando realizas un disparo.
 * 
 * Este un EstadoConcreto del patrón State. Es la ClaseAbstracta del patrón
 * Template. Es una hoja en el patrón Composite.
 * 
 * @author uo239795
 */
public abstract class ArmaConMunicion implements Arma {
	protected int cargador;
	protected Proyectiles proyectiles = new Proyectiles();

	@Override
	public void disparar() {
		if (cargador > 0) {
			dispararEspecifico(proyectiles);
			cargador--;
		} else
			System.err.println("No hay munición");
	}

	@Override
	public void mover() {
		proyectiles.mover();
	}

	@Override
	public void dibujar() {
		proyectiles.dibujar();
	}

	@Override
	public void borrar() {
		proyectiles.borrar();
	}

	protected abstract void dispararEspecifico(Proyectiles proyectiles);
}
