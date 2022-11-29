package arrays;

import java.util.Scanner;
/**
 * Write some Java code that asks the user how many favorite things they have. 
 * Based on their answer, you should create a String array of the correct size.
 * Then ask the user to enter the things and store them in the array you created.
 * Finally, print out the contents of the array.
 * 
 * @author Hanen Chemkhi
 *
 */
public class favoriteThings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of your favorite things");
		int size = input.nextInt();
		
		String[] favorites = new String[size];
		input.nextLine();
		for (int i = 0 ; i<size; i++) {
			System.out.print("Enter your favorite thing: ");
			favorites[i]= input.nextLine();
		}
		System.out.println("Your favorite things are: ");
		for (int i = 0; i<size; i++) {
			System.out.print(favorites[i] + " ");
		}

	}

}
