package modelo.Armas;

import modelo.Proyectiles;
import modelo.tiposProyectil.BolaDeFuego;

/**
 * Este un EstadoConcreto del patrón State. Es la ClaseAbstracta del patrón
 * Template. Es una hoja en el patrón Composite.
 * 
 * @author uo239795
 *
 */
public class Lanzallamas extends ArmaConMunicion {

	public Lanzallamas() {
		cargador = 5;
	}

	@Override
	protected void dispararEspecifico(Proyectiles proyectiles) {
		proyectiles.proyectil(new BolaDeFuego());
	}

	@Override
	public void recargar() {
		System.err.println("Este arma no se recarga.");
	}

	@Override
	public String toString() {
		return "lanzallamas.";
	}

}
