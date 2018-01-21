package main;

import java.io.IOException;

import outputs.Bluetooth;
import outputs.FileOutput;
import outputs.Internet;
import outputs.filters.Counter;
import outputs.filters.Encryptor;
import outputs.filters.Fork;
import outputs.filters.LinesFilter;
import outputs.filters.SpacesFilter;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem system = new FileSystem();

		// ------------------------------------------------
		// Dise�o de Referencia
		// Cambios: A�adir 3 clases (LinesFilter, SpacesFilter y Encriptor)
		system.copy("privado.txt",
				new LinesFilter(new FileOutput("privado2.txt")));
		system.copy("privado.txt", new Encryptor(new Internet("1.1.1.1")));
		system.copy("privado.txt",
				new Encryptor(new SpacesFilter(new Bluetooth("iPhone"))));

		// ------------------------------------------------
		// Modificaci�n 1: que se pueda encriptar al escribir en fichero
		// Cambios: Ninguno
		system.copy("privado.txt", new LinesFilter(new FileOutput("a.txt")));
		system.copy("privado.txt",
				new LinesFilter(new Encryptor(new FileOutput("b.txt"))));

		// ------------------------------------------------
		// Modificaci�n 2: en Internet que se pueda normalizar y/o eliminar
		// espacios
		// Cambios: Ninguno
		system.copy("privado.txt", new LinesFilter(new Internet("1.1.1.1")));
		system.copy("privado.txt", new SpacesFilter(new Internet("1.1.1.1")));
		system.copy("privado.txt",
				new SpacesFilter(new LinesFilter(new Internet("1.1.1.1"))));

		// ------------------------------------------------
		// Modificaci�n 3: Contar caracteres escritos
		// Cambios: A�adir clase Counter
		Counter counter = new Counter(new Internet("1.1.1.1"));
		system.copy("privado.txt", new LinesFilter(counter));
		System.out.println("Modificacion 3a: " + counter.getCounter());

		// Otra forma de hacerlo:
		system.copy("privado.txt", new LinesFilter(
				counter = new Counter(new Internet("1.1.1.1"))));
		System.out.println("Modificacion 3b: " + counter.getCounter());

		// ------------------------------------------------
		// Modificaci�n 4: Poder contar caracteres tambi�n antes de normalizar
		// Cambios: ninguno
		Counter despues = new Counter((new Internet("1.1.1.1")));
		Counter antes = new Counter(new LinesFilter(despues));
		system.copy("privado.txt", antes);
		System.out.println("Modificacion 4a: " + antes.getCounter() + " -> "
				+ despues.getCounter());

		// Otra forma de hacerlo:
		system.copy("privado.txt", antes = new Counter(new LinesFilter(
				despues = new Counter((new Internet("1.1.1.1"))))));
		System.out.println("Modificacion 4b: " + antes.getCounter() + " -> "
				+ despues.getCounter());

		// ------------------------------------------------
		// Modificaci�n 5: Se quiere que un fichero se encripte solo una vez
		// aunque se env�e a m�s de un destino
		// Cambios: A�adir clase Fork
		system.copy("privado.txt", new Encryptor(
				new Fork(new Internet("1.1.1.1"), new Bluetooth("iPhone"))));

	}
}
