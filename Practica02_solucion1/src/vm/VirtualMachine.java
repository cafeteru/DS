package vm;

import java.util.List;

import instrucciones.Instruccion;

public class VirtualMachine {
	private State state = new State();

	public void run(List<Instruccion> program) {
		while (state.getIP() < program.size())
			program.get(state.getIP()).execute(state);
	}
}
