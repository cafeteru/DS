package strategy;

import ligafutbol.Equipo;

public class ClasificarEdad implements Clasificacion {

	@Override
	public boolean clasificar(Equipo equipo, Equipo candidato) {
		return equipo.getEdad() == candidato.getEdad();
	}

}
