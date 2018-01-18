package loader;

import instrucciones.*;

public class JumpCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new Jump(Integer.parseInt(words[1]));
	}

}
