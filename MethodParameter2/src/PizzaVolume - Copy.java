public class PizzaVolume {

   public static void printPizzaVolume(double pizzaDiameter, double pizzaHeight) {
      double pizzaRadius;
      double pizzaArea;
      double pizzaVolume;
      double piVal = 3.14159265;

      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = piVal * pizzaRadius * pizzaRadius;
      pizzaVolume = pizzaArea * pizzaHeight;
      System.out.print(pizzaDiameter + " x " + pizzaHeight + " inch pizza is ");
      System.out.println(pizzaVolume + " inches cubed.");
   }

   public static void main (String [] args) {
      printPizzaVolume(12.0, 0.3);
      printPizzaVolume(12.0, 0.8);
      printPizzaVolume(16.0, 0.8);
   }
}