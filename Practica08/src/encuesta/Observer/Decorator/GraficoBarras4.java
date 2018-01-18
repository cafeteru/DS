package encuesta.Observer.Decorator;

import encuesta.Encuesta;
import encuesta.Observer.GraficoBarras;

public class GraficoBarras4 extends GraficoBarras {

	public GraficoBarras4(Encuesta encuesta) {
		super(encuesta);
	}

	@Override
	public void actualizar() {
		if (encuesta.getVotosSi() + encuesta.getVotosNo() >= 4)
			super.actualizar();
	}
}
