import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("how many numbers?");
		
		final int NUM_INPUTS = scnr.nextInt();
		int[] sumVals = new int[NUM_INPUTS];
		int sum = 0;
		int difference = 0;
		
		System.out.println("give numbers:");
		
		for (int i = 0; i < sumVals.length; ++i) {
			sumVals[i] = scnr.nextInt();	
		}
		for (int i = 0; i < sumVals.length; ++i) {
			sum = sum + sumVals[i];
			
		}
		System.out.println("The sum of your numbers: " + sum);
		System.out.println("first number and last number: " + sumVals[0] + " " + sumVals[sumVals.length - 1]);
		System.out.print("average of the array: " + (sum / (sumVals.length )));

	}

}
