package recorrerarboles;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Nodo;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

/*
 * Inconvenientes: Todo el c�digo de todos los nodos en un solo metodo
 */

public class RecorridoRecursivo {

	public void visit(Nodo nodo) {
		if (nodo instanceof Programa) {
			for (Sentencia sent : ((Programa) nodo).sentencias)
				visit(sent);
		} else if (nodo instanceof Print) {
			System.out.print("print ");
			visit(((Print) nodo).expr);
			System.out.println(";");
		} else if (nodo instanceof Read) {
			System.out.print("read ");
			visit(((Read) nodo).var);
			System.out.println(";");
		} else if (nodo instanceof Asignacion) {
			visit(((Asignacion) nodo).variable);
			System.out.print(" = ");
			visit(((Asignacion) nodo).expr);
			System.out.println(";");
		} else if (nodo instanceof ConstanteInt) {
			System.out.print(((ConstanteInt) nodo).valor);
		} else if (nodo instanceof Producto) {
			visit(((Producto) nodo).left);
			System.out.print(" * ");
			visit(((Producto) nodo).right);
		} else if (nodo instanceof Division) {
			visit(((Division) nodo).left);
			System.out.print(" / ");
			visit(((Division) nodo).right);
		} else if (nodo instanceof Suma) {
			visit(((Suma) nodo).left);
			System.out.print(" + ");
			visit(((Suma) nodo).right);
		} else if (nodo instanceof Variable) {
			System.out.print(((Variable) nodo).name);
		}
	}
}
