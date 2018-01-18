package loader;

import instrucciones.*;

public class SubCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Sub();
	}

}
