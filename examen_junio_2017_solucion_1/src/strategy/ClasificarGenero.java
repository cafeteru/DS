package strategy;

import ligafutbol.Equipo;

public class ClasificarGenero implements Clasificacion {

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return equipo.isMasculino() == candidato.isMasculino();
	}

}
