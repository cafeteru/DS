package instrucciones;

import java.util.Scanner;

import vm.State;

public class Input extends AbstractInstruccion {

	@Override
	protected void doExecute(State state) {
		System.out.println("Escriba un entero:");
		state.push(scanner.nextInt());
	}

	private Scanner scanner = new Scanner(System.in);
}
