package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Jmp extends InstruccionAbstracta{

	public Jmp(int valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		pila.setIp(valor);		
	}


}
