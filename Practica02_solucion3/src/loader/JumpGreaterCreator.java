package loader;

import instrucciones.*;

public class JumpGreaterCreator implements InstructionCreator {

	@Override
	public Instruccion create(String[] words) {
		return new JumpGreater(Integer.parseInt(words[1]));
	}

}
