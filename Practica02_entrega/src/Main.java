import Componentes.Programa;

public class Main {

	public static void main(String[] args) throws Exception {
		Programa programa = new Programa("factorial.txt");
		programa.ejecutar();
	}
}
