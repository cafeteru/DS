package parte1;

public class Main {

	public static void main(String[] args) {
		Temperatura[] temperaturas = new Temperatura[100];

		// Toma de datos
		for (int i = 0; i < temperaturas.length; i++)
			temperaturas[i] = new Temperatura(leeSensorCelsius());

		// Cálculo con los datos en Celsius
		double mediaCelsius = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaCelsius += temperaturas[i].getCelsius();
		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.println("Media en celsius: " + mediaCelsius);

		// Cálculo con los datos en Fahrenheit
		double mediaFahrenheit = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaFahrenheit += temperaturas[i].getFahrenheit();
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.println("Media en Fahrenheit: " + mediaFahrenheit);

		// Otro cálculo con los datos en Fahrenheit
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++)
			varianza += Math.pow((temperaturas[i].getFahrenheit())
					- mediaFahrenheit, 2);
		varianza = varianza / temperaturas.length;
		System.out.println("Varianza en Fahrenheit: " + varianza);
	}

	public static double leeSensorCelsius() {
		return Math.random() * 30;
	}
}
