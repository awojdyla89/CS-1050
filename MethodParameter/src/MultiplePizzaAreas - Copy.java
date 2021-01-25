public class MultiplePizzaAreas {

   public static void printPizzaArea(double pizzaDiameter) {
      double pizzaRadius;
      double pizzaArea;
      double piVal = 3.14159265;

      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = piVal * pizzaRadius * pizzaRadius;
      System.out.print(pizzaDiameter + " inch pizza is ");
      System.out.println(pizzaArea + " inches squared.");
   }

   public static void main (String [] args) {
      printPizzaArea(60.5);
      printPizzaArea(16.0);
   }
}