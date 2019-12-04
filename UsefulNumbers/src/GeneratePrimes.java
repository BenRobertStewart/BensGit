import java.util.Arrays;

public class GeneratePrimes {
	private static final int BIGGEST_NUMBER = 214748364;
	private String arrays;
	public GeneratePrimes() {

	}

	public int[] primeList(final int thePositivePrimesBelowThis) {
		int[] list = new int[thePositivePrimesBelowThis + 1];
		final Primes p = new Primes();
		for (int i = 0; i < list.length; i++) {
			if (p.isPrime(i)) {
				list[i] = i;

			}
		}
		while (containsZero(list)) {
			for (int i = 0; i < list.length; i++) {
				if (list[i] == 0) {
					list = removeTheElement(list, i);
				}

			}
		}
		arrays = Arrays.toString(list);
		return list;

	}
	public String arraysShortener(final String theArrays) {
		String newString = theArrays;
		
		for(int i = 0; i < theArrays.length(); i++) {
			if (newString.length() > 25 && newString.charAt(i) == 44 ) {
				newString = newString + "\n";
			}
		}
		arrays = newString;
		return newString;
	}

	public boolean containsZero(int[] theList) {
		boolean doesIt = false;
		for (int i = 0; i < theList.length; i++) {
			if (theList[i] == 0) {
				doesIt = true;
				theList = removeTheElement(theList, i);
			}

		}
		return doesIt;
	}

	public int[] removeTheElement(int[] arr, int index) {
		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}
		int[] anotherArray = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}

			anotherArray[k++] = arr[i];
		}

		return anotherArray;
	}

	public String getArrays() {
		return arrays;
	}

	public void setArrays(String arrays) {
		this.arrays = arrays;
	}
	
	
}
