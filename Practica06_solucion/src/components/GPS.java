package components;

public class GPS {

	public void navigate(String address) {
		System.out.println("GPS: Gire a la derecha. Ha llegado a '" + address + "'");
	}

	public Coordenadas getCoordenadas(String direccion) {
		// C�lculo de relleno. 
		// Devuelve la posici�n en funci�n de la primera letra
		double number = (direccion.toLowerCase().charAt(0) - 'a') * 10 + 10;
		return new Coordenadas(number, number);
	}

	public String getDireccion(Coordenadas coordenadas) {
		return coordenadas.toString();
	}
}
