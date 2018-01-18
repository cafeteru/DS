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
public class Metralleta extends ArmaConMunicion {

	public Metralleta() {
		cargador = 6;
	}

	@Override
	protected void dispararEspecifico(Proyectiles proyectiles) {
		proyectiles.proyectil(new Bala());
		proyectiles.proyectil(new Bala());
		cargador--;
	}

	@Override
	public void recargar() {
		cargador = 6;
	}

	@Override
	public String toString() {
		return "metralleta.";
	}

}
