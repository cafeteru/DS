package strategy;

import ligafutbol.Equipo;

public interface Clasificacion {

	boolean clasificar(Equipo equipo, Equipo candidato);
}
