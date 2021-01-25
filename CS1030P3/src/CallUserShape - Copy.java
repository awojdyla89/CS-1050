import java.util.Scanner;

public class CallUserShape {

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

	public static double calcRectangleArea(Scanner B, Scanner H) {
		System.out.println("Enter the base of the rectangle in cm(s): ");
		double base = B.nextDouble();

		System.out.print("Enter the height of the rectangle in cm(s): ");
		double height = H.nextDouble();
		return base * height;
	} // End method

	public static double calcSquareArea(Scanner B) {
		System.out.println("Enter the base of the rectangle in cm(s): ");
		double base = B.nextDouble();
		return base * base;
	} // End method

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		String shapeChoice = "";
		boolean invalid = false;

		System.out.println("Would you like to calculate the area of a shape? yes or no ");
		String answer = input.next();
		keepGoing = (answer.equalsIgnoreCase("yes"));
		invalid = !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"));

		while (keepGoing) {
			System.out.println("What shape? circle , triangle , rectangle, square");
			shapeChoice = input.next();

			if (shapeChoice.equalsIgnoreCase("circle")) {
				System.out.printf("Result is: %.2f sq. cm(s)%n" , calcCircleArea(input));
			} else if (shapeChoice.equalsIgnoreCase("triangle")) {
				System.out.printf("Result is: %.2f sq. cm(s)%n" , calcTriangleArea(input, input));
			} else if (shapeChoice.equalsIgnoreCase("square")) {
				System.out.printf("Result is: %.2f sq. cm(s)%n" , calcSquareArea(input));
			} else if (shapeChoice.equalsIgnoreCase("rectangle")) {
				System.out.printf("Result is: %.2f sq. cm(s)%n" , calcRectangleArea(input, input));
			}
			do {  
				System.out.println("Would you like to calculate the area of a shape? yes or no");
				answer = input.next();
				invalid = !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"));
				if (invalid) {
					System.out.println(answer + " is not a valid answer!!");
				}
			} while (invalid);
			keepGoing = (answer.equalsIgnoreCase("yes"));
		}
		System.out.println("Thanks for stopping by!");
	}
}
