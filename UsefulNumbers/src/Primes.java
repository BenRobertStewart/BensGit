
public class Primes {

	public Primes() {

	}

	public boolean isPrime(final int theNumber) {
		boolean isPrime = true;

		if (theNumber == 1) {
			isPrime = false;
			return isPrime;
		}
		
		if (theNumber % 2 == 0) {
			isPrime = false;
			return isPrime;
		}
		
		if (theNumber > 1) {
			for (int i = 2; i < Math.sqrt(theNumber) + 1; i++) {
				for (int j = 2; j  < Math.sqrt(theNumber) + 1; j++) {
					int result = i*j;
					if (result == theNumber) {
						isPrime = false;
						return isPrime;
					}
				}
			}
		}
		
		if (theNumber < -1) {
			for (int i = -2; i > Math.sqrt(theNumber) - 1; i--) {
				for (int j = -2; j  > Math.sqrt(theNumber) - 1; j--) {
					int result = i*-j;
					if (result == theNumber) {
						isPrime = false;
						return isPrime;
					}
				}
			}
		}
		
		
		return isPrime;
	}
}
