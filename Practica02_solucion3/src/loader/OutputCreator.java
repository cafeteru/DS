package loader;

import instrucciones.*;

public class OutputCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Output();
	}

}
