package encuesta.Observer;

import encuesta.Encuesta;

public class GraficoBarras implements Observador {

	protected Encuesta encuesta;

	public GraficoBarras(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	@Override
	public void actualizar() {
		System.out.println("Dibujando gráfico de barras");
	}

}
