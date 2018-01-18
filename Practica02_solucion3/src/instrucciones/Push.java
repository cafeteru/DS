package instrucciones;
import vm.*;

public class Push extends AbstractInstruccion {

	public Push(int value) {
		this.value = value;
	}

	@Override
	protected void doExecute(State state) {
		state.push(value);
	}

	private int value;
}
