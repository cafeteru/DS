package parte2;

public class Main {

	public static void main(String[] args) {

		Customer raul = new Customer("Raúl");

		Movie hotFuzz = new Movie("Hot Fuzz", new Movie_new_release());
		Movie toyStory = new Movie("Toy Story", new Movie_childrens());
		Movie zombiesParty = new Movie("Zombies Party", new Movie_regular());

		hotFuzz.setTipo(new Movie_regular());
		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
