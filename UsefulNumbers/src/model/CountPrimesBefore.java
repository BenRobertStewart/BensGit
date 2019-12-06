package model;
public class CountPrimesBefore {
    public CountPrimesBefore() {
        
    }
    
    public int primesBefore (int num) {
        GeneratePrimes gp = new GeneratePrimes();
        
        int[] theArray = gp.primeList(num);
        int primes = theArray.length;
        return primes;
    }
}
