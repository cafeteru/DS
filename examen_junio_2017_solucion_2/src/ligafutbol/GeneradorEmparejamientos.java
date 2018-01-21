package ligafutbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import template.ClasificacionEdad;
import template.ClasificacionGenero;

// Devuelve una tabla hash en la que cada equipo (clave) tiene asociada una lista de equipos
// (valor) con los que tiene que jugar
public class GeneradorEmparejamientos {
	public Map<Equipo, List<Equipo>> empareja(List<Equipo> equipos) {
		Map<Equipo, List<Equipo>> emparejamientos = new HashMap<Equipo, List<Equipo>>();

		ClasificacionGenero cg = new ClasificacionGenero();
		ClasificacionEdad ce = new ClasificacionEdad();

		// inicializa la estructura de datos (inicialmente cada equipo tiene una
		// lista vacía de contrincantes)
		for (Equipo equipo : equipos) {
			emparejamientos.put(equipo, new ArrayList<Equipo>());
		}

		// emparejamientos.get(equipo_N) --> devuelve la lista de equipos contra
		// los
		// que tiene que jugar 'equipo_N'
		for (Equipo equipo : equipos) {
			for (Equipo candidato : equipos) {
				if (equipo != candidato
						&& !emparejamientos.get(equipo).contains(candidato)) {
					if (cg.doClasificar(equipo, candidato)
							&& ce.doClasificar(equipo, candidato)) {
						emparejamientos.get(equipo).add(candidato);
						emparejamientos.get(candidato).add(equipo);
					}
				}
			}
		}

		return emparejamientos;
	}
}
