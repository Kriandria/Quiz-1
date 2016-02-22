package MainPackage;

public class Main {

	public static void main(String[] args) {

		double rating = QBRating.calculate();
		System.out.printf("The player's rating is %.1f%n", rating);
	}
}