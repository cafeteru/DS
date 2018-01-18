package parte2;

public class Movie_childrens implements MovieType {

	@Override
	public double getPrice(Rental rental) {
		// TODO Auto-generated method stub
		double price = 1.5;
		if (rental.getDays() > 3)
			price += (rental.getDays() - 3) * 1.5;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		// TODO Auto-generated method stub
		return 1;
	}
}
