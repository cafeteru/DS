package loader;

import instrucciones.*;

public class InputCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Input();
	}

}
