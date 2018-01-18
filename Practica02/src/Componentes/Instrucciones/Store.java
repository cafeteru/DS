package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Store implements Instruccion {

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		int valor = pila.pop();
		int direccion = pila.pop();
		compilador.getMemoria()[direccion] = valor;
		pila.aumentarPila();
	}

}
