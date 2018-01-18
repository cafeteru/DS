package loader;

import instrucciones.*;

public class MulCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Mul();
	}

}
