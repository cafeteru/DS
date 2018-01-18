package parte2;

// Alquiler

public class Rental {
	private Movie movie;
	private int days;

	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public Movie getMovie() {
		return movie;
	}

	double getPrice() {
		return movie.getTipo().getPrice(this);
	}

	int getPoints() {
		return movie.getTipo().getPoints(this);
	}
}
