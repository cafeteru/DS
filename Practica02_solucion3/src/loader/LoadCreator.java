package loader;

import instrucciones.*;

public class LoadCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Load();
	}

}
