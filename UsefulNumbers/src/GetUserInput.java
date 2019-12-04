import java.util.Scanner;

public class GetUserInput {

	public GetUserInput() {

	}

	public void printOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to:\n1. Check Prime Status\n2. Find GCD\n3. Find Inverse");
		int option = sc.nextInt();
		if (option == 1) {
			final Primes p = new Primes();
			System.out.print("What number do you want to know the prime status of?: ");
			int numberToCheck = sc.nextInt();
			if (p.isPrime(numberToCheck)) {
				System.out.println(numberToCheck + " is Prime!");

			}
			if (!p.isPrime(numberToCheck)) {
				System.out.println(numberToCheck + " is not Prime!");

			}
		}

		if (option == 2) {
			final GCD f = new GCD();
			System.out.println("What two numbers would you like to find the GCD of");
			System.out.println("Number 1:");
			int num1 = sc.nextInt();
			System.out.println("Number 2:");
			int num2 = sc.nextInt();
			System.out.println("The GCD of the numbers (" + num1 + ", " + num2 + ") is " + f.gcd(num1, num2));
		}

		if (option == 3) {
			final InverseCoefficients ic = new InverseCoefficients();
			final GCD f = new GCD();
			System.out.print("What two numbers would you like to find Inverse Coefficients of?: ");
			System.out.println("Number 1:");
			int num1 = sc.nextInt();
//			sc.hasNext();
			System.out.println("Number 2:");
			int num2 = sc.nextInt();
			ic.findCoefficient(num1, num2);
			System.out.print("The Inverse Function is: " + ic.getFirstCoefficient() + "(" + num1 + ")" + " + "
					+ ic.getSecondCoefficient() + "(" + num2 + ") = " + f.gcd(num1, num2));
		}
	}
}
