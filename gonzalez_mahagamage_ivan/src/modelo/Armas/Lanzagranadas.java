package modelo.Armas;

import modelo.Proyectiles;
import modelo.tiposProyectil.Granada;

/**
 * Este un EstadoConcreto del patrón State. Es la ClaseAbstracta del patrón
 * Template. Es una hoja en el patrón Composite.
 * 
 * @author uo239795
 *
 */
public class Lanzagranadas extends ArmaConMunicion {
	public Lanzagranadas() {
		cargador = 1;
	}

	@Override
	protected void dispararEspecifico(Proyectiles proyectiles) {
		proyectiles.proyectil(new Granada());
	}

	@Override
	public void recargar() {
		cargador = 1;
	}

	@Override
	public String toString() {
		return "lanzagranadas.";
	}
}
