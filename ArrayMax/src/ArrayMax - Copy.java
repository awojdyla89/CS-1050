import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter # of values: ");
		final int MAX_VAL = scnr.nextInt();
		int[] userVals = new int[MAX_VAL];
		int i;
		int maxVal;
		int minVal;
		
		System.out.println("Enter your " + MAX_VAL + " values:");
		
		for (i = 0; i < userVals.length; ++i) {
			//System.out.print("value: ");
			userVals[i] = scnr.nextInt();
		}
		maxVal = userVals[0];
		
		for (i = 0; i < userVals.length; ++i) {
			if (userVals[i] > maxVal) {
				maxVal = userVals[i];
			}
		}
		minVal = userVals[0];
		
		for (i = 0; i < userVals.length; ++i) {
			if (userVals[i] < minVal) {
						minVal = userVals[i];
					}
				}
		
		System.out.println("max value: " + maxVal);
		System.out.print("Min val: " + minVal);
	}

}
