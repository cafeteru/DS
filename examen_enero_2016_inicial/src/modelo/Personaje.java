package modelo;

public class Personaje 
{
	private String arma;
	private int posicion;
	private int cargador;

	public Personaje(String arma) 
	{
		setArma(arma);
	}

	public void avanzar() 
	{
		posicion++;
	}

	public void dibujar() 
	{
		System.out.println("Personaje en la posición " + posicion + " con el arma " + arma);
	}

	public void setArma(String arma) 
	{
		this.arma = arma;
		recargar();
	}

	public void disparar(Proyectiles proyectiles) 
	{
		if (cargador > 0) {
			if (arma.equals("Pistola")) {
				proyectiles.proyectil(new Proyectil("bala"));
			} else if (arma.equals("Lanzagranadas")) {
				proyectiles.proyectil(new Proyectil("granada"));
			} else
				throw new IllegalStateException();
			cargador--;
		}
	}

	public void recargar() 
	{
		if (arma.equals("Pistola"))
			cargador = 3;
		else if (arma.equals("Lanzagranadas"))
			cargador = 1;
		else
			throw new IllegalStateException();
	}
}
