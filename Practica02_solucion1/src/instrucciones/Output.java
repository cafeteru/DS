package instrucciones;
import vm.*;

public class Output extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		System.out.println(state.pop());
	}
}
