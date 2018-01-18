package loader;

import instrucciones.*;

public class PushCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Push(Integer.parseInt(words[1]));
	}

}
