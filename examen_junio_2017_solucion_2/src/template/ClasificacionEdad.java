package template;

import ligafutbol.Equipo;

public class ClasificacionEdad extends Clasificacion {

	@Override
	public boolean doClasificar(Equipo equipo, Equipo candidato) {
		return equipo.getEdad() == candidato.getEdad();
	}

}
