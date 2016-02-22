package MainPackage;
import java.util.Scanner;

public class QBRating {

	public static double calculate() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter total touchdowns made: ");
		double touchdowns = scan.nextByte();
		System.out.print("Please enter total yards passed: ");
		double tYards = scan.nextInt();
		System.out.print("Please enter total interceptions thrown: ");
		double interceptions = scan.nextByte();
		System.out.print("Please enter total completions: ");
		double completions = scan.nextInt();
		System.out.print("Please enter total attempted passes: ");
		double attempted = scan.nextInt();
		scan.close();
		
		double TDS = (touchdowns / attempted) * 20;
		double YDS = (tYards / attempted - 3) * 0.25;
		double COMP = (completions / attempted - 0.3) * 5;
		double INT = 2.375 - (interceptions / attempted * 25);
		
		return (TDS + YDS + COMP + INT) / 6 * 100;
		
	}
	
}