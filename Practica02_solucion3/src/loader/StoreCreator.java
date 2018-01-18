package loader;

import instrucciones.*;

public class StoreCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Store();
	}

}
