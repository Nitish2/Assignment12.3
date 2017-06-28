package VoterAge;
/** Make a method named test it should take age as parameter 
 * Make throw statement it throws exception NotEligibleToVoteException
 */

import java.util.Scanner;

public class AgeVoter {

	public void test(int age) throws NotEligibleToVoteException {

		try { // try block

			if (age > 18) { // implemented the if else statements

				System.out.println("Eligible");

			} else {

				throw new NotEligibleToVoteException(); // throw statement

			}

		}

		catch (Exception e) { // catch statement it catches the exception

			System.err.println("Not Eligible." + e);

		}
	}

	public static void main(String[] args) { // Main method

		Scanner sc = new Scanner(System.in); // Scanner object for input from console
											

		System.out.println("Enter the age of voter"); // Ask user to enter the age
														

		int age = sc.nextInt(); // Declaring a variable age

		AgeVoter t = new AgeVoter(); // Making object of test class

		try {
			t.test(age);

		} catch (NotEligibleToVoteException e) {
			// TODO Auto-generated catch block

		}
		sc.close(); // Closing scanner input

	}
}
