package nodos;

import recorrerarboles.Visitor;

public interface Nodo {
	Object accept(Visitor v, Object param);
}
