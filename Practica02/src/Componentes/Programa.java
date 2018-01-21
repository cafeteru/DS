package Componentes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Componentes.Instrucciones.Add;
import Componentes.Instrucciones.Input;
import Componentes.Instrucciones.Instruccion;
import Componentes.Instrucciones.Jmp;
import Componentes.Instrucciones.Jmpg;
import Componentes.Instrucciones.Load;
import Componentes.Instrucciones.Mul;
import Componentes.Instrucciones.Output;
import Componentes.Instrucciones.Push;
import Componentes.Instrucciones.Store;
import Componentes.Instrucciones.Sub;

public class Programa {
	private List<String[]> instrucciones = new ArrayList<String[]>();
	private Compilador compilador;

	public Programa(String programa) throws IOException {
		instrucciones = new Fichero(programa).getInstrucciones();
		compilador = new Compilador();
	}

	public void ejecutar() {
		identificarInstrucciones();
	}

	public void identificarInstrucciones() {
		Pila pila = compilador.getPila();
		while (pila.getIp() < instrucciones.size()) {
			String[] instruccion = instrucciones.get(pila.getIp());
			Instruccion aux = null;
			if (instruccion[0].equals("push"))
				aux = new Push(Integer.valueOf(instruccion[1]));
			else if (instruccion[0].equals("add"))
				aux = new Add();
			else if (instruccion[0].equals("sub"))
				aux = new Sub();
			else if (instruccion[0].equals("mul"))
				aux = new Mul();
			else if (instruccion[0].equals("jmp"))
				aux = new Jmp(Integer.valueOf(instruccion[1]));
			else if (instruccion[0].equals("jmpg"))
				aux = new Jmpg(Integer.valueOf(instruccion[1]));
			else if (instruccion[0].equals("load"))
				aux = new Load();
			else if (instruccion[0].equals("store"))
				aux = new Store();
			else if (instruccion[0].equals("input"))
				aux = new Input();
			else if (instruccion[0].equals("output"))
				aux = new Output();
			aux.ejecutar(compilador);
		}
	}
}
