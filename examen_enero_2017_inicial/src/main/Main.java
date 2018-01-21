package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.Juego;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	public void run() throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));

		Juego juego = new Juego("Pistola");

		System.out.println("Acciones: disparar, recargar, borrar y salir");
		System.out.println(
				"Cambiar arma: pistola, granadas, láser, lanzallamas, metralleta y escopeta");

		do {
			System.out.print(">");
			String comando = in.readLine();

			if (comando.equals("salir"))
				return;

			if (comando.startsWith("dis"))
				juego.getPersonaje().disparar(juego.getProyectilesEnVuelo());
			else if (comando.startsWith("rec"))
				juego.getPersonaje().recargar();
			else if (comando.startsWith("bor"))
				juego.getProyectilesEnVuelo().borrar();
			else if (comando.startsWith("pis"))
				juego.getPersonaje().setArma("Pistola");
			else if (comando.startsWith("gra"))
				juego.getPersonaje().setArma("Lanzagranadas");
			else
				System.out.println("Acción no válida");

			juego.actualizar();
			juego.dibujar();
		} while (true);
	}
}
