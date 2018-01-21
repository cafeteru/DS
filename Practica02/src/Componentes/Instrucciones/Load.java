package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Load implements Instruccion {

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		int direccion = pila.pop();
		pila.push(compilador.getMemoria()[direccion]);
		pila.aumentarPila();
	}

}
