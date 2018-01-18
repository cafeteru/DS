package modelo.Armas;

import modelo.Proyectiles;
import modelo.tiposProyectil.Bala;

/**
 * Este un EstadoConcreto del patrón State Es la ClaseAbstracta del patrón
 * Template Es una hoja en el patrón Composite.
 * 
 * @author uo239795
 *
 */
public class EscopetaFeria extends ArmaConMunicion {

	private boolean encasquillada;

	public EscopetaFeria() {
		cargador = 5;
		encasquillada = false;
	}

	@Override
	protected void dispararEspecifico(Proyectiles proyectiles) {
		if (cargador % 2 != 0 && !encasquillada) {
			proyectiles.proyectil(new Bala());
			encasquillada = true;
		} else {
			encasquillada = false;
		}

	}

	@Override
	public String toString() {
		return "escopeta de feria.";
	}

	@Override
	public void recargar() {
		cargador = 5;
		encasquillada = false;
	}
}
