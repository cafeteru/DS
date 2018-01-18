package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Output implements Instruccion{

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		System.out.println(pila.pop());
		pila.aumentarPila();
	}

}
