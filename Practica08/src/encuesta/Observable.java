package encuesta;

import java.util.ArrayList;
import java.util.List;

import encuesta.Observer.Observador;

public class Observable {

	private List<Observador> observers;

	public Observable() {
		observers = new ArrayList<>();
	}

	public void añadir(Observador observador) {
		observers.add(observador);
	}

	public void eliminar(Observador observador) {
		observers.remove(observador);
	}

	public void notificar() {
		for (Observador observador : observers) {
			observador.actualizar();
		}
	}

}
