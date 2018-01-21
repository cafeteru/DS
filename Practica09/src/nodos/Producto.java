package nodos;

import recorrerarboles.Visitor;

public class Producto implements Expresion {
	public Expresion left, right;

	public Producto(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, null);
	}
}
