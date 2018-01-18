package ligafutbol;

import java.util.*;

// Devuelve una tabla hash en la que cada equipo (clave) tiene asociada una lista de equipos
// (valor) con los que tiene que jugar
public class GeneradorEmparejamientos 
{
	public Map<Equipo, List<Equipo>> empareja(List<Equipo> equipos) 
	{
		Map<Equipo, List<Equipo>> emparejamientos = new HashMap<Equipo, List<Equipo>>();

		// inicializa la estructura de datos (inicialmente cada equipo tiene una
		// lista vacía de contrincantes)
		for (Equipo equipo : equipos) {
			emparejamientos.put(equipo, new ArrayList<Equipo>()); 
		}

		// emparejamientos.get(equipo_N) --> devuelve la lista de equipos contra los 
		// que tiene que jugar 'equipo_N'
		for (Equipo equipo : equipos) {
			for (Equipo candidato : equipos) {
				if (equipo != candidato && !emparejamientos.get(equipo).contains(candidato)) {
					if (equipo.isMasculino() == candidato.isMasculino() && equipo.getEdad() == candidato.getEdad()) {
						emparejamientos.get(equipo).add(candidato);
						emparejamientos.get(candidato).add(equipo);
					}
				}
			}
		}

		return emparejamientos;
	}
}
