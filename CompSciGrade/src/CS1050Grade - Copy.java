import java.util.Scanner;


public class CS1050Grade {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double finalGrade;

		double progProjects = 90.5 * 0.179;
		double twoExams = 72.5 * 0.143;
		System.out.println("Enter final exam : ");
		double finalExam = scnr.nextDouble() * 0.107;
		double zybooksPaCa = 100 * 0.179;
		double zybooksLab = 100 * 0.25;
		double mfVideos = 104 * 0.036;
		double bookReport = 100 * 0.036;
		double participation = 106 * 0.071;
		
		finalGrade = (progProjects + twoExams + finalExam + zybooksPaCa + zybooksLab + mfVideos + bookReport + participation);
		
		System.out.printf("Your final grade is: %%%.2f" , finalGrade);
		
	}

} 
