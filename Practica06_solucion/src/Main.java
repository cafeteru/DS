import adapters.*;
import vista.*;
import model.*;

public class Main {

	public static void main(String[] args) {

		Database db = new Database();
		Mapa map = new Mapa();

		// 1. Meter elementos en el mapa
		System.out.println("\n 1. Metiendo elementos en el mapa");

		for (Monumento monumento : db.selectMonumentos()) {
			map.add(new MonumentoAdapter(monumento));
		}

		for (Foto foto : db.selectFotos()) {
			map.add(new FotoAdapter(foto));
		}

		for (Restaurante restaurante : db.selectRestaurantes()) {
			map.add(new RestauranteAdapter(restaurante));
		}

		// 2. En el mapa se dibujan los marcadores para los elementos añadidos al mapa
		System.out.println("\n 2. Mostrando mapa");
		map.dibujar();

		// 3. El usuario presiona brevemente la pantalla para recibir información de
		// cada elemento
		System.out.println("\n 3. Pulsación breve sobre cada elemento: información en tooltip");
		map.click(11, 11); // Nombre y autor del monumento (coliseo)
		map.click(21, 21); // Descripción de la foto y usuario que la ha subido
		map.click(31, 31); // Nombre y teléfono del restaurante

		// 4. El usuario deja pulsado un marcador para abrir un elemento
		System.out.println("\n 4. Pulsación larga sobre cada elemento: abrir elemento");
		map.longClick(11, 11); // Navegar hasta el coliseo con el GPS
		map.longClick(21, 21); // Bajarse foto
		map.longClick(31, 31); // Llamar al restaurante
	}

}
