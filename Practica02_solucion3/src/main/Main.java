package main;

import instrucciones.*;

import java.io.*;
import java.util.*;

import loader.*;

import vm.*;

public class Main {

	public static void main(String[] args) throws Exception {
		ProgramLoader loader = createLoader();
		List<Instruccion> program = loader.loadProgram(new FileReader("programa.txt"));

		VirtualMachine vm = new VirtualMachine();
		vm.run(program);
	}

	private static ProgramLoader createLoader() throws Exception {
		ProgramLoader loader = new ProgramLoader();
		BufferedReader fichero = new BufferedReader(new FileReader("src/config.txt"));

		String linea;
		while ((linea = fichero.readLine()) != null) {
			String[] words = linea.split(":");
			Class c = Class.forName(words[1]);
			loader.registerLoader(words[0], (InstructionCreator) c.newInstance());
		}
		fichero.close();
		return loader;
	}
}
