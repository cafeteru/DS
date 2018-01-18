package modelo;

public class Juego 
{
	private Personaje personaje;
	private Proyectiles proyectilesEnVuelo;

	public Juego(String arma) 
	{
		personaje = new Personaje(arma);
		proyectilesEnVuelo = new Proyectiles();
	}

	public Personaje getPersonaje() 
	{
		return personaje;
	}

	public Proyectiles getProyectilesEnVuelo() 
	{
		return proyectilesEnVuelo;
	}

	public void actualizar() 
	{
		personaje.avanzar();
		proyectilesEnVuelo.mover();
	}

	public void dibujar() 
	{
		personaje.dibujar();
		proyectilesEnVuelo.dibujar();
	}
}
