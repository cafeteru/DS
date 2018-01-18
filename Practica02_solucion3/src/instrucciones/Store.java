package instrucciones;
import vm.*;

public class Store extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		int valor = state.pop();
		int direccion = state.pop();

		state.write(direccion, valor);
	}
}
