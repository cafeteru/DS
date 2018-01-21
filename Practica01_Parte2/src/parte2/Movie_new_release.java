package parte2;

public class Movie_new_release implements MovieType {

	@Override
	public double getPrice(Rental rental) {
		// TODO Auto-generated method stub
		return rental.getDays() * 3;
	}

	@Override
	public int getPoints(Rental rental) {
		if (rental.getDays() > 1)
			return 2;
		return 1;
	}
}
