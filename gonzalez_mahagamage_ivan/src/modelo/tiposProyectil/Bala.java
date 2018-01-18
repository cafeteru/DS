package modelo.tiposProyectil;

/**
 * Es una estrategiaConcreta del patrón Strategy.
 * 
 * @author uo239795
 *
 */
public class Bala implements Proyectil {

	@Override
	public void dibujar() {
		System.out.println("Bala");
	}

	@Override
	public void mover() {
		System.out.println("Se mueve recto y va cayendo");
	}

}
