package recorrerarboles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

public class PrintVisitor implements Visitor {
	BufferedReader console = new BufferedReader(
			new InputStreamReader(System.in));
	HashMap<String, Integer> valores = new HashMap<>();

	@Override
	public Object visit(Programa programa, Object param) {
		for (Sentencia sent : programa.sentencias)
			sent.accept(this, param);
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		try {
			System.out.print("Introduzca " + read.var.name + ": ");
			int value = Integer.parseInt(console.readLine());
			valores.put(read.var.name, value);
		} catch (NumberFormatException e) {
			System.out.println("Debe introducir n�mero entero");
		} catch (IOException e) {
			System.out.println(
					"Se produjo un error al leer el valor de la variable");
		}
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {
		System.out.println(print.expr.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Asignacion asignacion, Object param) {
		valores.put(asignacion.variable.name,
				(Integer) asignacion.expr.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Suma suma, Object param) {
		return (Integer) suma.left.accept(this, param)
				+ (Integer) suma.right.accept(this, param);
	}

	@Override
	public Object visit(Producto producto, Object param) {
		return (Integer) producto.left.accept(this, param)
				* (Integer) producto.right.accept(this, param);
	}

	@Override
	public Object visit(Division division, Object param) {
		return (Integer) division.left.accept(this, param)
				/ (Integer) division.right.accept(this, param);
	}

	@Override
	public Object visit(Variable variable, Object param) {
		return valores.get(variable.name);
	}

	@Override
	public Object visit(ConstanteInt constanteInt, Object param) {
		return Integer.parseInt(constanteInt.valor);
	}

}
