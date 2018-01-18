package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Sub implements Instruccion {

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		int b = pila.pop(), a = pila.pop();
		pila.push(a - b);
		pila.aumentarPila();
	}

}
