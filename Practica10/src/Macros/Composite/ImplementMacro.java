package Macros.Composite;

import java.util.ArrayList;
import java.util.List;

import Macros.Macro;
import Sentencias.Sentencia;

public class ImplementMacro implements Macro {
	List<Sentencia> sentencias;

	public ImplementMacro() {
		sentencias = new ArrayList<>();
	}

	@Override
	public void ejecutar() {
		for (Sentencia sentencia : sentencias)
			sentencia.ejecutar();
	}

}
