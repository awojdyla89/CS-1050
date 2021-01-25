import java.util.ArrayList;
import java.util.Scanner;

public class MostPopularOS {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> operatingSystems = new ArrayList<String>(); 
      int nthOS;      // User input, Nth most popular OS
      
      // Source: StatCounter.com, 2018
      operatingSystems.add("Windows 10");
      operatingSystems.add("Windows 7");
      operatingSystems.add("Mac OS X");
      operatingSystems.add("Windows 8");
      operatingSystems.add("Windows XP");
      operatingSystems.add("Linux");
      operatingSystems.add("Chrome OS");
      operatingSystems.add("Other");

      System.out.println("Enter N (1-8): ");
      nthOS = scnr.nextInt();

      if ((nthOS >= 1) && (nthOS <= 8)) {
         System.out.print("The " + nthOS + "th most popular OS is ");
         System.out.println(operatingSystems.get(nthOS - 1));
      } else {
    	  System.out.println("Thats not an option!!");
      }
   }
}