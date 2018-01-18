package encuesta.Observer.Decorator;

import encuesta.Encuesta;
import encuesta.Observer.GraficoCircular;

public class GraficoCircular3 extends GraficoCircular {

	public GraficoCircular3(Encuesta encuesta) {
		super(encuesta);
	}

	@Override
	public void actualizar() {
		if (encuesta.getVotosSi() + encuesta.getVotosNo() >= 3)
			super.actualizar();
	}

}
