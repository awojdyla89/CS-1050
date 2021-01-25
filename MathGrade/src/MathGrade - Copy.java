import java.util.Scanner;
public class MathGrade {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double exam1;
		double exam2;
		double exam3;
		double mathematica;
		double hW;
		double finalExam;
		double finalGrade;
		double participation;
		System.out.println("Enter exam 1: ");
		exam1 = scnr.nextDouble() * 0.15;
		System.out.println("Enter exam 2: ");
		exam2 = scnr.nextDouble() * 0.15;
		System.out.println("Enter exam 3: ");
		exam3 = scnr.nextDouble() * 0.15;
		System.out.println("enter mathematica: ");
		mathematica = scnr.nextDouble() * 0.10;
		System.out.println("hw: ");
		hW = scnr.nextDouble() * 0.15;
		System.out.println("Enter final exam grade: ");
		finalExam = scnr.nextDouble() * 0.25;
		participation = 100 * 0.05;
		
		finalGrade = (exam1 + exam2 + exam3 + hW + mathematica + finalExam + participation / 100.0);
		System.out.println("Your final grade is: " + finalGrade);
		
	}

}
