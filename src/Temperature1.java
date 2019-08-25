import java.util.*;

/**
 * Copied Building Java Programs pg447
 * 
 *
 */
public class Temperature1 {
	private static Scanner console;
	public static void main(String[] args) {
		console = new Scanner( System.in);
		System.out.print("How many days' temperatures? ");;
		int numDays = console.nextInt();
		int sum = 0;
		for (int i = 1; i <= numDays; i++) {
			System.out.print("Day " + i + " ' s high temp: ");;
			int next = console.nextInt();
			sum += next;
		}
		double average = (double) sum / numDays;
		System.out.println("Average = " + average);
	}
}
 
