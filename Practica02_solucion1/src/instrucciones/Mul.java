package instrucciones;

import vm.State;

public class Mul extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		state.push(state.pop() * state.pop());
	}
}
