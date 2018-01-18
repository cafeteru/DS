package modelo.tiposProyectil;

/**
 * Es una estrategiaConcreta del patrón Strategy.
 * 
 * @author uo239795
 *
 */
public class BolaDeFuego implements Proyectil {

	@Override
	public void dibujar() {
		System.out.println("Bola de fuego");
	}

	@Override
	public void mover() {
		System.out.println("Se mueve recto y con poco alcance");
	}

}
