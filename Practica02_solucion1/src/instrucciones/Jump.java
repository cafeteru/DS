package instrucciones;
import vm.*;

public class Jump implements Instruccion {
	public Jump(int direccion) {
		this.direccion = direccion;
	}

	@Override
	public void execute(State state) {
		state.setIP(direccion);
	}

	private int direccion;
}
