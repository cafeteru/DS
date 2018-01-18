package Componentes;

public class Compilador {
	private int[] memoria;
	private Pila pila;

	public Compilador() {
		memoria = new int[1024];
		pila = new Pila();
	}

	public int[] getMemoria() {
		return memoria;
	}

	public void setMemoria(int[] memoria) {
		this.memoria = memoria;
	}

	public Pila getPila() {
		return pila;
	}

	public void setPila(Pila pila) {
		this.pila = pila;
	}
}
