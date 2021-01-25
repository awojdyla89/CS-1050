import java.util.Scanner;

public class AreaOfShape {
	
	// Calculate area of triangle method
	public static double calcTriangleArea(Scanner B, Scanner H) {
		System.out.print("Enter the base of the triangle in cm(s): ");
		double base = B.nextDouble();
		
		System.out.print("Enter the height of the triangle in cm(s): ");
		double height = H.nextDouble();
		
		return 0.5 * base * height;
	} // End method
	
	// Calculate area of a circle method
	public static double calcCircleArea(Scanner D) {
		System.out.print("Enter the diameter of the circle in cm(s): ");
		double diameter = D.nextDouble();
		return Math.PI * diameter;
	} // End method

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	double triangle;
	double circle;
	
	// Calls methods into main and set them to new variable for printing
	triangle = Math.round(calcTriangleArea(scnr, scnr) * 100 / 100);
	circle = calcCircleArea(scnr);
	
	// Prints the calculations in centimeters with user input
	System.out.println("\n" + "The area of the triangle is: " + triangle + " sq. cm(s)" + "\n");
	

	System.out.println("The area of the circle is : " + circle + " sq. cm(s)");
	} // End main 

} // End class
