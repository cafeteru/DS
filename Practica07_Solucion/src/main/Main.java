package main;

import java.io.*;

import outputs.*;
import outputs.filters.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem system = new FileSystem();

		// ------------------------------------------------
		// Diseño de Referencia
		// Cambios: Añadir 3 clases (LinesFilter, SpacesFilter y Encriptor)
		system.copy("privado.txt", new LinesFilter(new FileOutput("privado2.txt")));
		system.copy("privado.txt", new Encryptor(new Internet("1.1.1.1")));
		system.copy("privado.txt", new Encryptor(new SpacesFilter(new Bluetooth("iPhone"))));

		// ------------------------------------------------
		// Modificación 1: que se pueda encriptar al escribir en fichero
		// Cambios: Ninguno
		system.copy("privado.txt", new LinesFilter(new FileOutput("a.txt")));
		system.copy("privado.txt", new LinesFilter(new Encryptor(new FileOutput("b.txt"))));

		// ------------------------------------------------
		// Modificación 2: en Internet que se pueda normalizar y/o eliminar espacios
		// Cambios: Ninguno
		system.copy("privado.txt", new LinesFilter(new Internet("1.1.1.1")));
		system.copy("privado.txt", new SpacesFilter(new Internet("1.1.1.1")));
		system.copy("privado.txt", new SpacesFilter(new LinesFilter(new Internet("1.1.1.1"))));

		// ------------------------------------------------
		// Modificación 3: Contar caracteres escritos
		// Cambios: Añadir clase Counter
		Counter counter = new Counter(new Internet("1.1.1.1"));
		system.copy("privado.txt", new LinesFilter(counter));
		System.out.println("Modificacion 3a: " + counter.getCounter());

		// Otra forma de hacerlo:
		system.copy("privado.txt", new LinesFilter(counter = new Counter(new Internet("1.1.1.1"))));
		System.out.println("Modificacion 3b: " + counter.getCounter());

		// ------------------------------------------------
		// Modificación 4: Poder contar caracteres también antes de normalizar
		// Cambios: ninguno
		Counter despues = new Counter((new Internet("1.1.1.1")));
		Counter antes = new Counter(new LinesFilter(despues));
		system.copy("privado.txt", antes);
		System.out.println("Modificacion 4a: " + antes.getCounter() + " -> " + despues.getCounter());

		// Otra forma de hacerlo:
		system.copy("privado.txt", antes = new Counter(new LinesFilter(despues = new Counter((new Internet("1.1.1.1"))))));
		System.out.println("Modificacion 4b: " + antes.getCounter() + " -> " + despues.getCounter());

		// ------------------------------------------------
		// Modificación 5: Se quiere que un fichero se encripte solo una vez aunque se envíe a más de un destino
		// Cambios: Añadir clase Fork
		system.copy("privado.txt", new Encryptor(new Fork(new Internet("1.1.1.1"), new Bluetooth("iPhone"))));

	}
}
