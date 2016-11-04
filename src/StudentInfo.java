import java.util.Scanner;

/**
 * 
 */

/**
 * @author q.ronnmark
 * Name: Quenton Ronnmark
 * Teacher: Mr.Hardman
 * Assignment 3
 */
public class StudentInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int Grade;
		String Login;
		int ID;
		double Average;
		
		System.out.println("What is your First Name?");
		firstName = userInput.next();
		
		System.out.println("What is your Last Name?");
		lastName = userInput.next();
		
		System.out.println("What Grade are you in?");
		Grade = userInput.nextInt();
		
		System.out.println("What is your Id?");
		ID = userInput.nextInt();
		
		System.out.println("What is your login?");
		Login = userInput.next();
		
		System.out.println("What is your Average?");
		Average = userInput.nextDouble();
		
		System.out.println( String.format("%-15s" + Login, "Login:"));
		System.out.println( String.format("%-15s" + ID, "ID:"));
		System.out.println( String.format("%-15s" + lastName + ", " + firstName, "Name:"));
		System.out.println( String.format("%-15s" + Average, "Average:"));
		System.out.println( String.format("%-15s" + Grade, "Grade:"));
	}

}
