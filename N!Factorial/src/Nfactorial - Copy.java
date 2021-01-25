import java.util.Scanner;
public class Nfactorial {
	public static int Factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return n = n * Factorial(n - 1);
	}

	public static int fibonacci(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static int fact(int n ) {
		
		for(int i = n - 1; i > 0; i--) {
			n *= i;
		}
		return n;
	}

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
		System.out.println(Factorial(10));
		System.out.println(fibonacci(10));
		System.out.println(fact(10));
	}

}
