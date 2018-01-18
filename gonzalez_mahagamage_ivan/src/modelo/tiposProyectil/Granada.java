package modelo.tiposProyectil;

/**
 * Es una estrategiaConcreta del patrón Strategy.
 * 
 * @author uo239795
 *
 */
public class Granada implements Proyectil {

	@Override
	public void dibujar() {
		System.out.println("Granada");
	}

	@Override
	public void mover() {
		System.out.println("Se mueve en trayectoria parabólica");
	}

}
