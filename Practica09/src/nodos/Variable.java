package nodos;

import recorrerarboles.Visitor;

public class Variable implements Expresion {
	public String name;
	public int valor;

	public Variable(String name) {
		this.name = name;
		valor = 0;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
