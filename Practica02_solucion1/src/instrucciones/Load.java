package instrucciones;
import vm.*;

public class Load extends AbstractInstruccion {

	protected void doExecute(State context) {
		context.push(context.read(context.pop()));
	}
}
