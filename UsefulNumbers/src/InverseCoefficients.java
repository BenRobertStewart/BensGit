
public class InverseCoefficients {

	private int firstCoefficient;
	private int secondCoefficient;

	public InverseCoefficients() {

	}

	public void findCoefficient(final int x, final int y) {
		int a = x;
		int b = y;
		int c = 1;
		int d = -1;
		GCD gcd = new GCD();
		int f = gcd.gcd(x, y);
		if (c*a + d*b == f) {
			setFirstCoefficient(1);
			setSecondCoefficient(-1);
		
		} 
		else if (d*a + c*b == f) {
			
			setFirstCoefficient(-1);
			setSecondCoefficient(1);
			
			
		} else {
				
				for (c = 1; c < 100; c++) {
					for (d = -1; d > -100; d--) {
						
						int first = c*a;
						int second = d*b;
						if (first + second == f) {
							setFirstCoefficient(c);
							setSecondCoefficient(d);
							break;
						} else {
							continue;
						}
						
						
			
					}
				

			}
			
			
		}
		

	}

	public int getFirstCoefficient() {
		return firstCoefficient;
	}

	public void setFirstCoefficient(int firstCoefficient) {
		this.firstCoefficient = firstCoefficient;
	}

	public int getSecondCoefficient() {
		return secondCoefficient;
	}

	public void setSecondCoefficient(int secondCoefficient) {
		this.secondCoefficient = secondCoefficient;
	}

}
