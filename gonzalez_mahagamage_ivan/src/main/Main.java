package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.Juego;
import modelo.Armas.EscopetaFeria;
import modelo.Armas.Lanzagranadas;
import modelo.Armas.Lanzallamas;
import modelo.Armas.Metralleta;
import modelo.Armas.Pistola;
import modelo.Armas.PistolaLaser;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	public void run() throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));

		Juego juego = new Juego(new Pistola());

		System.out.println("Acciones: disparar, recargar, borrar y salir");
		System.out.println(
				"Cambiar arma: pistola, granadas, láser, lanzallamas, metralleta y escopeta");

		do {
			System.out.print(">");
			String comando = in.readLine();

			if (comando.equals("salir"))
				return;

			if (comando.startsWith("dis"))
				juego.getPersonaje().disparar();
			else if (comando.startsWith("rec"))
				juego.getPersonaje().recargar();
			else if (comando.startsWith("bor"))
				juego.getPersonaje().borrar();
			else if (comando.startsWith("pis"))
				juego.getPersonaje().setArma(new Pistola());
			else if (comando.startsWith("gra"))
				juego.getPersonaje().setArma(new Lanzagranadas());
			else if (comando.startsWith("laser"))
				juego.getPersonaje().setArma(new PistolaLaser());
			else if (comando.startsWith("lanza"))
				juego.getPersonaje().setArma(new Lanzallamas());
			else if (comando.startsWith("metr"))
				juego.getPersonaje().setArma(new Metralleta());
			else if (comando.startsWith("esc"))
				juego.getPersonaje().setArma(new EscopetaFeria());
			else
				System.out.println("Acción no válida");

			juego.actualizar();
			juego.dibujar();
		} while (true);
	}
}
