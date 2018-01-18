package vm;
import instrucciones.*;

import java.util.*;

public class VirtualMachine {
	private State state = new State();

	public void run(List<Instruccion> program) {
		while (state.getIP() < program.size())
			program.get(state.getIP()).execute(state);
	}
}

