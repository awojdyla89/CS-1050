import java.util.Scanner;

class TestScoresLetter {

	// Calculate grade average method
	public static double calcGradeAverage(Scanner scores, double sum, double average, int count) {
		final int NUM_SCORES = scores.nextInt();
		double[] studentScores = new double[NUM_SCORES];
		System.out.println("Enter the " + NUM_SCORES + " test score values:");

		// For loop prompts for test scores and evaluates sum of scores
		for (int i = 0; i < studentScores.length; i++) {
			System.out.print("Test Score #" + count++ + ": ");
			studentScores[i] = scores.nextDouble();
			sum += studentScores[i];
		} // End for
		average = (sum / NUM_SCORES);
		return average;
	} // End calcGradeAverage method

	// Letter grade Method
	public static String letterGrade(double average) {
		String result;
		if (average >= 90) {
			result = ("'A'" + "\n...great job!");
		} else if (average >= 80) {
			result = "'B'" + "\n...well done!";
		} else if (average >= 70) {
			result = "'C'" + "\n...average is average.";
		} else if (average >= 60) {
			result = "'D'" + "\n...you should try to actually study.";
		} else {
			result = "'F'" + "\n...time to re-register for this class.";
		} // End if
		return result;
	} // End letterGrade method

	// Main method
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstName = ""; // Students first name
		String lastName = ""; // Students last name
		String letterGrade; // Letter grade
		double sum = 0.0; // Sum of test scores
		double average = 0.0; // Average of sum
		int count = 1; // Test score counter

		// Prompts user to input first and last name
		System.out.print("Students First name? ");
		firstName = scnr.next();
		System.out.print("Students Last name? ");
		lastName = scnr.next();

		// Formats first and last name
		firstName = firstName.substring(0, 1).toUpperCase();
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		System.out.printf("Number of test results for %s. %s? ", firstName, lastName);

		// Calls methods for average score and letter grade
		average = calcGradeAverage(scnr, sum, average, count);
		letterGrade = letterGrade(average);

		// Prints first and last name and average score to console
		System.out.printf("%n%s. %s's ", firstName, lastName);
		System.out.printf("average test score is %.2f%% ", average);
		System.out.print("or a " + letterGrade);

	} // End main

} // End class
