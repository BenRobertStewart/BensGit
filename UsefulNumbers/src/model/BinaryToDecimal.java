package model;

public class BinaryToDecimal {

	public BinaryToDecimal() {
		
	}
	
	public double getDecimalOf(final String binaryNum) {
		double decimalNum = 0;
		if (binaryNum.startsWith("0") && binaryNum.endsWith("0")) {
			return 0;
		}
		for(int i = 0; i < binaryNum.length(); i++) {
			
			if(binaryNum.charAt(i) == '1') {
				double exp = Math.pow(2, binaryNum.length() - 1 - i);
				decimalNum = decimalNum + exp;
			}
				
		}
		
		
		return decimalNum;
	}
}
