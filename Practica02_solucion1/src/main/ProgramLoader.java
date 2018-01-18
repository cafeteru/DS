package main;
import instrucciones.*;

import java.io.*;
import java.util.*;

public class ProgramLoader {
	public List<Instruccion> loadProgram(Reader reader) throws IOException {

		BufferedReader fichero = new BufferedReader(reader);
		List<Instruccion> programa = new ArrayList<Instruccion>();

		String linea;
		while ((linea = fichero.readLine()) != null) {
			if (linea.trim().length() > 0)
				programa.add(creaInstruccion(linea));
		}
		fichero.close();
		return programa;
	}

	private Instruccion creaInstruccion(String linea) {
		String[] word = linea.split(" ");

		if (word[0].equals("add"))
			return new Add();
		if (word[0].equals("sub"))
			return new Sub();
		if (word[0].equals("mul"))
			return new Mul();
		if (word[0].equals("load"))
			return new Load();
		if (word[0].equals("store"))
			return new Store();
		if (word[0].equals("input"))
			return new Input();
		if (word[0].equals("output"))
			return new Output();

		int operando = Integer.parseInt(word[1]);

		if (word[0].equals("push"))
			return new Push(operando);
		if (word[0].equals("jmp"))
			return new Jump(operando);
		if (word[0].equals("jmpg"))
			return new JumpGreater(operando);

		throw new IllegalArgumentException();
	}
}
