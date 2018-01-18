package instrucciones;
import vm.*;

public abstract class AbstractInstruccion implements Instruccion {
	
	public void execute(State state) {
		doExecute(state);
		state.setIP(state.getIP() + 1);
	}

	protected abstract void doExecute(State mv);
}
