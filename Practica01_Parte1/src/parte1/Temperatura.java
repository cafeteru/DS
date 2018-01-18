package parte1;

public class Temperatura {
	private double celsius;

	public Temperatura(double celsius) {
		this.celsius = celsius;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return celsius * 1.8 + 32;
	}

	public void setFahrenheit(double fahrenheit) {
		this.celsius = (fahrenheit - 32) / 1.8;
	}
}
