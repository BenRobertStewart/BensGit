package model;
import java.util.Arrays;
import java.util.Scanner;

public class GetUserInput {

    public GetUserInput() {

    }

    public void printOptions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to:\n1. Check Prime Status\n2. Find GCD\n3. Find Inverse\n4. Generate Primes up to number n\n5. Convert Decimal to Binary\n6. Convert Binary to Decimal");
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
            System.out.println("The GCD of the numbers (" + num1 + ", " + num2 + ") is "
                               + f.gcd(num1, num2));
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
            System.out.print("The Inverse Function is: " + ic.getFirstCoefficient() + "("
                             + num1 + ")" + " + " + ic.getSecondCoefficient() + "(" + num2
                             + ") = " + f.gcd(num1, num2));
        }

        if (option == 4) {
            final GeneratePrimes gp = new GeneratePrimes();
            System.out.print("Enter number n that you would like to generate primes up to: ");
            int n = sc.nextInt();
            final CountPrimesBefore cp = new CountPrimesBefore();
            int p = cp.primesBefore(n);
            System.out.println("\nThere are "+p+" primes up to the number " + n + "\nwhich are:");
            gp.primeList(n);
            String s = gp.getArrays();
            gp.arraysShortener(s);
            String j = gp.getArrays();
//			System.out.println(j);
        }
        
        if (option == 5) {
        	final DecimalToBinary db = new DecimalToBinary();
        	System.out.print("Enter number to get binary of: ");
        	int n = sc.nextInt();
        	String binary = db.getBinaryOf(n);
        	System.out.println(binary);
        }
        
        if (option == 6) {
        	final BinaryToDecimal bd = new BinaryToDecimal();
        	System.out.print("Enter the binary number to get decimal value of: ");
        	String s = sc.next();
        	double decimalValue = bd.getDecimalOf(s);
        	System.out.println(decimalValue);
        }

    }
}
