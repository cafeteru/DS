package loader;

import instrucciones.*;

public class AddCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Add();
	}

}
