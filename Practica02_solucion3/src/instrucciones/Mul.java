package instrucciones;
import vm.*;

public class Mul extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		state.push(state.pop() * state.pop());
	}
}
