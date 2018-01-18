package Editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Herramientas.Herramienta;
import Macros.Macro;
import Sentencias.Strategy.Abrir;
import Sentencias.Strategy.Borrar;
import Sentencias.Strategy.Insertar;
import Sentencias.Strategy.Reemplazar;

public class Editor {
	List<Macro> macros;
	Herramienta herramienta;
	BufferedReader in;
	StringBuilder texto;
	String[] line;

	public Editor() {
		in = new BufferedReader(new InputStreamReader(System.in));
		texto = new StringBuilder("");
		macros = new ArrayList<>();
		herramienta = new Herramienta();
	}

	public void leerLinea() throws IOException {
		System.out.print("> ");
		line = in.readLine().split(" ");
		comprobarLinea();
	}

	private void comprobarLinea() {
		if (line[0].equals("salir"))
			return;
		if (line[0].equals("abre")) {
			texto = new Abrir(texto, line).ejecutar();
		} else if (line[0].startsWith("ins")) {
			texto = new Insertar(texto, line).ejecutar();
		} else if (line[0].startsWith("borr")) {
			texto = new Borrar(texto, line).ejecutar();
		} else if (line[0].startsWith("reem")) {
			texto = new Reemplazar(texto, line).ejecutar();
		} else if (line[0].startsWith("graba")) {
			;
		} else if (line[0].startsWith("para")) {
			;
		} else if (line[0].startsWith("ejecuta")) {
			;
		} else {
			System.out.println("Instrucción desconocida");
		}
		System.out.println(texto);
	}
}
