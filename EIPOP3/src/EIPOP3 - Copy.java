import java.util.Scanner;

public class EIPOP3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		/*
		 * int a = 7; int b = 10; int c = 15;
		 * 
		 * a = c - b / 2; b = a + b / 3; c += (b + 1);
		 * 
		 * System.out.println("1: " + a + " " + b + " " + c);
		 * 
		 * a = c + b * 2; a += 3; b = a - b; c /= 5;
		 * 
		 * System.out.println("2: " + a + " " + b + " " + c);
		 */
		/*
		 * double userNum; double result;
		 * 
		 * System.out.println("Enter number value: "); userNum = scnr.nextDouble();
		 * result = Math.pow(Math.E , userNum);
		 * System.out.println("e to that power is: " + result);
		 */
		Scanner keys = new Scanner(System.in);
		System.out.print("Enter mileage to be reimbursed: ");
		double mileage = keys.nextDouble();
		double reimb;

		if (mileage <= 0) {
			reimb = 0; 
		} 
		else if (mileage > 0 && mileage < 800) {
			reimb = mileage * 0.14;
		} 
		else if (mileage >= 800 && mileage < 1100) {
			reimb = 105.00 + (mileage - 800) * 0.10;
		} 
		else {
			reimb = 120.00 + (mileage - 1100) * 0.08;
		}
		System.out.println("Reimbursement: " + reimb);
	}

}
