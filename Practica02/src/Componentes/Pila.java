package Componentes;

public class Pila {
	private int[] tamanio = new int[32];
	private int sp, ip;

	public Pila() {
		sp = 0;
		ip = 0;
	}

	public void push(int valor) {
		tamanio[sp] = valor;
		sp++;
	}

	public int pop() {
		sp--;
		return tamanio[sp];
	}

	public void aumentarPila() {
		setIp(getIp() + 1);
	}

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}
}
