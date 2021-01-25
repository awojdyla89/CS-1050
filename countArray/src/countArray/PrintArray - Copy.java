package countArray;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
	
	      Scanner scnr = new Scanner(System.in);
	      final int NUM_ELEMENTS = 5;
	      int [] runTimes = new int[NUM_ELEMENTS];
	      int i;

	      System.out.println("Enter five numbers:");
	      
	      for (i = 0; i < runTimes.length; ++i) {
	         runTimes[i] = scnr.nextInt();
	      }
	          for (i = 0; i >= 0 && i <= 2; ++i){
	      System.out.println(runTimes[i]);
	       }

	   }
	}
