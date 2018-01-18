package editor.command;

import java.util.Stack;

public class Historial {
	private Stack<Cambio> pilaDeshacer;
	private Stack<Cambio> pilaRehacer;

	public Historial() {
		pilaDeshacer = new Stack<>();
		pilaRehacer = new Stack<>();
	}

	public void añadirCambio(Cambio cambio) {
		pilaDeshacer.push(cambio);
		pilaRehacer.clear();
	}

	public void deshacer() {
		if (!pilaDeshacer.isEmpty()) {
			Cambio aux = pilaDeshacer.pop();
			aux.deshacer();
			pilaRehacer.push(aux);
		} else
			System.out.println("No hay nada que deshacer");
	}

	public void rehacer() {
		if (!pilaRehacer.isEmpty()) {
			Cambio aux = pilaRehacer.pop();
			aux.rehacer();
			pilaDeshacer.push(aux);
		} else
			System.out.println("No hay nada que rehacer");
	}

}
