package main;

import java.io.FileReader;
import java.util.List;

import instrucciones.Instruccion;
import vm.VirtualMachine;

public class Main {

	public static void main(String[] args) throws Exception {
		ProgramLoader loader = new ProgramLoader();
		List<Instruccion> program = loader
				.loadProgram(new FileReader("programa.txt"));

		VirtualMachine vm = new VirtualMachine();
		vm.run(program);
	}
}
