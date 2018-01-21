package template;

import ligafutbol.Equipo;

public class ClasificacionGenero extends Clasificacion {

	@Override
	public boolean doClasificar(Equipo equipo, Equipo candidato) {
		return equipo.isMasculino() == candidato.isMasculino();
	}

}
