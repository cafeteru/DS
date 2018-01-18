package encuesta.Observer;

import encuesta.Encuesta;

public class ObserverContador implements Observador {

	protected Encuesta encuesta;

	public ObserverContador(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	@Override
	public void actualizar() {
		System.out.println("Votos a favor: " + encuesta.getVotosSi());
		System.out.println("Votos en contra: " + encuesta.getVotosNo());
	}
}
