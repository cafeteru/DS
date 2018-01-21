package Componentes.Instrucciones;

import java.util.Scanner;

import Componentes.Compilador;
import Componentes.Pila;

public class Input implements Instruccion {

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		System.out.println("Escriba un entero:");
		pila.push(leerValor());
		pila.aumentarPila();
	}

	@SuppressWarnings("resource")
	private static int leerValor() {
		return new Scanner(System.in).nextInt();
	}

}
