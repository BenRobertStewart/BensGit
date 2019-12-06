package model;
import static java.lang.StrictMath.min;

public class GCD {

	private Primes myPrimes = new Primes();
	public GCD() {
		
	}
	
	public int gcd(final int a, final int b) {
		int gcd = 1;
		int c = a;
		int d = b;
		 int n = min(c,d);
	        for(int i = 2; i <= n; i++)
	        {
	            while(c % i == 0 && d % i==0)
	            {
	                gcd = gcd * i;
	                c = c / i;
	                d = d / i;
	            }
	        }
		
		
		return gcd;
	}
	public Primes getMyPrimes() {
		return myPrimes;
	}
	
	
}
