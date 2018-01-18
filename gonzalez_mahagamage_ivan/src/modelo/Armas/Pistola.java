package modelo.Armas;

import modelo.Proyectiles;
import modelo.tiposProyectil.Bala;

/**
 * Este un EstadoConcreto del patrón State. Es la ClaseAbstracta del patrón
 * Template. Es una hoja en el patrón Composite.
 * 
 * @author uo239795
 *
 */
public class Pistola extends ArmaConMunicion {

	public Pistola() {
		cargador = 3;
	}

	@Override
	protected void dispararEspecifico(Proyectiles proyectiles) {
		proyectiles.proyectil(new Bala());
	}

	@Override
	public void recargar() {
		cargador = 3;
	}

	@Override
	public String toString() {
		return "pistola.";
	}

}
