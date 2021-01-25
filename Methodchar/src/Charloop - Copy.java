import java.util.Scanner;

public class Charloop {
	public static char SearchArray(char oneChar) {
		if (oneChar >= 'A' && oneChar <= 'Z') {
			oneChar = (char) ((int)oneChar + 3);
		}
		return oneChar;
	}
	
	public static double[] Array1(int[] firstArray) {
		int list = firstArray.length;
		double[] Array2 = new double[list];
		for (int i = 0; i < list; i++) {
			Array2[i] = firstArray[i] / 2.0;
		}
		return Array2;
	}
	
	public static int SearchValue(char[] array, char value) {
		int num = array.length;
		int element = -1;
		for (int i = 0; i < num; ++i) {
			if (array[i] == value) {
				element = i;
				break;
			}
		}
		return element;
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
			System.out.println( SearchArray('C'));
			
			
	}
}
 