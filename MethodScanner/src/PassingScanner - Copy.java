import java.util.Scanner;

public class PassingScanner {

   public static double calcCircleArea(double circleDiameter) {
      double circleRadius;
      double circleArea;
      double piVal = 3.14159265;

      circleRadius = circleDiameter / 2.0;
      circleArea = piVal * circleRadius * circleRadius;

      return circleArea;
   }

   public static double getPizzaCalories(Scanner scnr) {
      double pizzaDiameter;
      double totalCalories;
      double caloriesPerSquareInch = 16.7;    // Regular crust pepperoni pizza

      System.out.print("Enter pizza's diameter (inches): ");
      pizzaDiameter = scnr.nextDouble();
      if (pizzaDiameter > 15) {
    	  System.out.println("you are such a fatty !! .... but enjoy the pizza.");
      }else {
    	  System.out.println("Good choice Stay skinny!!");
      
      }

      totalCalories = calcCircleArea(pizzaDiameter) * caloriesPerSquareInch;
      

      return totalCalories;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.println("Pizza has " + getPizzaCalories(scnr) + " calories.");
      System.out.println("Pizza has " + getPizzaCalories(scnr) + " calories.");
   }
}