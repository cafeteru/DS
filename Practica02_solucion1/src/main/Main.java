package main;
import instrucciones.*;

import java.io.*;
import java.util.*;

import vm.*;

public class Main {

	public static void main(String[] args) throws Exception {
		ProgramLoader loader = new ProgramLoader();
		List<Instruccion> program = loader.loadProgram(new FileReader("programa.txt"));
		
		VirtualMachine vm = new VirtualMachine();
		vm.run(program);
	}
}
