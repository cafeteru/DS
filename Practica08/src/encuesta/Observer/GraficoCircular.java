package encuesta.Observer;

import encuesta.Encuesta;

public class GraficoCircular implements Observador {

	protected Encuesta encuesta;

	public GraficoCircular(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	@Override
	public void actualizar() {
		System.out.println("Dibujando gráfico circular");
	}

}
