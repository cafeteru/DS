package loader;

import instrucciones.*;

public interface InstructionCreator {
	public Instruccion create(String[] words);
}
