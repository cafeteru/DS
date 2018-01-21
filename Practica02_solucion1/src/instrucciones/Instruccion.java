package instrucciones;

import vm.State;

public interface Instruccion {
	public void execute(State state);
}
