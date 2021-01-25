import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("How many numbers in your search list?");
      final int NUM_VALS = scnr.nextInt();
      int[] userValues = new int[NUM_VALS];
      int i;
      int matchValue;
      int numMatches = -99; // Assign numMatches with 0 before your for loop
      System.out.println("What value are you looking for?");
      matchValue = scnr.nextInt();
      System.out.println("List your " + NUM_VALS + " values:");
      for (i = 0; i < userValues.length; ++i) {
    	  //System.out.println("What value are you looking for?");
         userValues[i] = scnr.nextInt();
      }
      
        numMatches = 0;
      for (i = 0; i < NUM_VALS; ++i){
         if (userValues[i] == matchValue){
            ++numMatches;
         }
         
      }

      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}