package components;

public class Coordenadas {

	private double longitude;
	private double latitude;

	public Coordenadas(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public double getLongitud() {
		return longitude;
	}

	public double getLatitud() {
		return latitude;
	}

	@Override
	public String toString() {
		return "[longitude=" + longitude + ", latitude=" + latitude + "]";
	}

}