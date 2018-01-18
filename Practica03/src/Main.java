import java.awt.*;
import java.util.List;
import java.io.*;
import java.util.*;

import editor.*;
import editor.figuras.*;
import editor.raton.Raton;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	public void run() throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		Dibujo dibujo = new Dibujo();
		Editor editor = new Editor(dibujo, new Raton(dibujo));
		
		puntos = new ArrayList<>();
		int contadorFigura = 0, contador = 0;

		System.out.println("Comandos Herramientas: cuadrado, circulo, triangulo, seleccion");
		System.out.println("Comandos Ratón: pinchar x,y / mover x,y / soltar x,y");
		System.out.println("Otros Comandos: dibujar, exit");
		Figura figura = null;
		do {
			System.out.print(">");
			String[] line = in.readLine().split("[ ,]");

			if (line[0].equals("exit"))
				return;
			if (line[0].equals("cuadrado")) {
				contadorFigura = 2;
				figura = new Cuadrado(new Point(), new Point());
			} else if (line[0].equals("circulo")) {
				contadorFigura = 2;
				figura = new Circulo(new Point(), new Point());
			} else if (line[0].equals("triangulo")) {
				contadorFigura = 3;
				figura = new Triangulo(new Point(), new Point(), new Point());
			} else if (line[0].equals("seleccion"))
				contadorFigura = 1; 
			else if (line[0].equals("pinchar")) {
				int x = Integer.parseInt(line[1]);
				int y = Integer.parseInt(line[2]);
				puntos.add(editor.getRaton().pinchar(x, y));
				contador++;
			} else if (line[0].equals("mover")) {
				Integer.parseInt(line[1]);
				Integer.parseInt(line[2]);
			} else if (line[0].equals("soltar")) {
				int x = Integer.parseInt(line[1]);
				int y = Integer.parseInt(line[2]);
				puntos.add(editor.getRaton().soltar(x, y));
				contador++;
			} else if (line[0].equals("dibujar"))
				editor.dibujar();
			else
				System.out.println("Comando no válido");

			if (contador == contadorFigura) {
				if (figura instanceof Cuadrado)
					editor.getDibujo().añadirFigura(new Cuadrado(puntos.get(0), puntos.get(1)));
				else if (figura instanceof Circulo)
					editor.getDibujo().añadirFigura(new Circulo(puntos.get(0), puntos.get(1)));
				else if (figura instanceof Triangulo)
					editor.getDibujo().añadirFigura(new Triangulo(puntos.get(0), puntos.get(1), puntos.get(2)));
				contador = 0;
				contadorFigura = 0;
				puntos.clear();
				figura = null;
			}
		} while (true);
		
	}

	private BufferedReader in;
	private List<Point> puntos;

}
