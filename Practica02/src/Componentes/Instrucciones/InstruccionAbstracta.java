package Componentes.Instrucciones;

public abstract class InstruccionAbstracta implements Instruccion {
	int valor;

	public InstruccionAbstracta(int valor) {
		this.valor = valor;
	}
}
