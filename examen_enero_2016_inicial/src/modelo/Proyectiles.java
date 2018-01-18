package modelo;

import java.util.*;

public class Proyectiles 
{
	private List<Proyectil> proyectiles = new ArrayList<Proyectil>();

	public void proyectil(Proyectil proyectil) 
	{
		proyectiles.add(proyectil);
	}

	public void dibujar() 
	{
		System.out.println("-- Proyectiles en vuelo:");
		for (Proyectil proyectil : proyectiles) {
			if (proyectil.getTipo().equals("bala"))
				System.out.println("Bala");
			else if (proyectil.getTipo().equals("granada"))
				System.out.println("Granada");
		}
	}

	public void mover() 
	{
		for (Proyectil proyectil : proyectiles) {
			if (proyectil.getTipo().equals("bala"))
				; // Se mueve recto y va cayendo
			else if (proyectil.getTipo().equals("granada"))
				; // Se mueve en trayectoria parabólica
		}
	}

	public void borrar() 
	{
		proyectiles.clear();
	}
}
