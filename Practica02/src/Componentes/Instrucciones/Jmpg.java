package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Jmpg extends InstruccionAbstracta {

	public Jmpg(int valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		int b = pila.pop();
		int a = pila.pop();
		if (a > b)
			pila.setIp(valor);
		else
			pila.aumentarPila();
	}

}
