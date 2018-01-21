import adapter.AdapterMonument;
import adapter.AdapterPhoto;
import adapter.AdapterRestaurante;
import model.Database;
import model.Monument;
import model.Photo;
import model.Restaurant;
import views.MapView;

public class Main {

	public static void main(String[] args) {

		Database db = new Database();
		MapView map = new MapView();

		// 1. Meter elementos en el mapa
		System.out.println("\n 1. Metiendo elementos en el mapa");

		for (Monument monumento : db.selectMonuments()) {
			map.add(new AdapterMonument(monumento));
		}

		for (Photo foto : db.selectPhotos()) {
			map.add(new AdapterPhoto(foto));
		}

		for (Restaurant restaurante : db.selectRestaurant()) {
			map.add(new AdapterRestaurante(restaurante));
		}

		// 2. En el mapa se dibujan los marcadores para los elementos a�adidos
		// al mapa
		System.out.println("\n 2. Mostrando mapa");
		map.draw();

		// 3. El usuario presiona brevemente la pantalla para recibir
		// informaci�n de
		// cada elemento
		System.out.println(
				"\n 3. Pulsaci�n breve sobre cada elemento: informaci�n en tooltip");
		map.click(11, 11); // Nombre y autor del monumento (coliseo)
		map.click(21, 21); // Descripci�n de la foto y usuario que la ha subido
		map.click(31, 31); // Nombre y tel�fono del restaurante

		// 4. El usuario deja pulsado un marcador para abrir un elemento
		System.out.println(
				"\n 4. Pulsaci�n larga sobre cada elemento: abrir elemento");
		map.longClick(11, 11); // Navegar hasta el coliseo con el GPS
		map.longClick(21, 21); // Bajarse foto
		map.longClick(31, 31); // Llamar al restaurante
	}

}
