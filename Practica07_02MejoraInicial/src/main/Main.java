package main;
import java.io.*;

import decorator.*;
import decorator.Modificaciones.*;
import outputs.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem system = new FileSystem();
		system.copy("privado.txt", new FileOutput("copia.txt"));
		system.copy("privado.txt", new Internet("1.1.1.1"));
		system.copy("privado.txt", new Bluetooth("iPhone"));
		system.copy("privado.txt", new Normalizar(new Bluetooth("iPhone")));
		system.copy("privado.txt", new Encriptar(new Normalizar(new Bluetooth("iPhone"))));
		system.copy("privado.txt", new Modificacion1(new Bluetooth("iPhone"), true));
		system.copy("privado.txt", new Modificacion2(new Bluetooth("iPhone"), 0));
		system.copy("privado.txt", new Modificacion2(new Bluetooth("iPhone"), 1));
		system.copy("privado.txt", new Modificacion2(new Bluetooth("iPhone"), 2));
		system.copy("privado.txt", new Modificacion2(new Bluetooth("iPhone"), 3));
		system.copy("privado.txt", new Modificacion3(new Bluetooth("iPhone")));
		system.copy("privado.txt", new Modificacion4(new Bluetooth("iPhone")));
		system.copy("privado.txt", new Modificacion5(new Bluetooth("iPhone"), new Internet("1.1.1.1")));
	}

}
