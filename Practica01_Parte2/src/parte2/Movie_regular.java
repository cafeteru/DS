package parte2;

public class Movie_regular implements MovieType {

	@Override
	public double getPrice(Rental rental) {
		// TODO Auto-generated method stub
		double price = 2;
		if (rental.getDays() > 2)
			price += (rental.getDays() - 2) * 1.5;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		// TODO Auto-generated method stub
		return 1;
	}
}
