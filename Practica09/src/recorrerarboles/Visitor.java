package recorrerarboles;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Suma;
import nodos.Variable;

public interface Visitor {
	Object visit(Programa programa, Object param);

	Object visit(Read read, Object param);

	Object visit(Print print, Object param);

	Object visit(Asignacion asignacion, Object param);

	Object visit(ConstanteInt constanteInt, Object param);

	Object visit(Division division, Object param);

	Object visit(Suma suma, Object param);

	Object visit(Variable variable, Object param);

	Object visit(Producto producto, Object param);
}
