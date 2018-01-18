package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Push extends InstruccionAbstracta {

	public Push(int valor) {
		super(valor);
	}

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		pila.push(valor);
		pila.aumentarPila();
	}

}
