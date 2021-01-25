import java.util.Scanner;

	public class TestScores {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);	
		String firstName = null;		// Students first name
		String lastName;		// Students last name
		double sum = 0.0; 		// Sum of test scores 
		double average = 0.0;	// Average of sum
		int count = 1;			// Test score counter
		
		// Prompts user to input first name
		System.out.print("Students First name? ");		
		firstName = scnr.next();
		
		// Prompts user to input last name
		System.out.print("Students Last name? ");		
		lastName = scnr.next();
		
		// Formats first name and last name 
		firstName = firstName.substring(0 , 1).toUpperCase();									   
		lastName = lastName.substring(0, 1).toUpperCase() 
				    + lastName.substring(1).toLowerCase(); 
		
		System.out.print("# of test results for " + firstName + ". " + lastName + " ? "); 
		
		// # of tests to evaluate is stored to be used
		final int NUM_SCORES = scnr.nextInt();
		double[] studentScores = new double[NUM_SCORES];   						
		
		System.out.println("Enter the " + NUM_SCORES + " test score values:");
		
		// For loop cycles through # of elements
		for (int i = 0; i < studentScores.length; i++) {						
			System.out.print("Test Score #" + count++ + ": ");					
			studentScores[i] = scnr.nextDouble();
		} // End for
		
		// For loop cycles through test score values and sums total
		for (int i = 0; i < studentScores.length; i++) {						
			sum += studentScores[i] ;
		} // End for
		
		// Calculates average of scores and rounds to 2 decimal places
		average = Math.round((sum / NUM_SCORES) * 100.0)/ 100.0;
		
		// Prints first and last name and average score to console
		System.out.print("\n" + firstName + ". " + lastName + "'s ");
		System.out.print( "average test score: " + average + "%");		
	} // End main

} // End class

	