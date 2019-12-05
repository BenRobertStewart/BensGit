
public class DecimalToBinary {
	
	/* Example :
	 * 105 to binary = 64 + 32 + 8 + 1 = 2^6 + 2^5 + 2^3 + 2^0 = 1101001
	 */
	
	public DecimalToBinary() {
		
	}
	
	
	public String getBinaryOf(int decimalNumber) {
		String binaryReversed ="";
		String realBinary = "";
		int temp = decimalNumber;
		int specificInt = 0;
		if(decimalNumber == 0) {
			return "0";
		}
		while (temp > 0) {
			specificInt = temp % 2;
			binaryReversed = binaryReversed + specificInt;
			temp = temp/2;
		}
	
		
		for(int i = binaryReversed.length() -1; i >= 0; i--) {
			realBinary = realBinary + binaryReversed.charAt(i);
		}
		

		
		return realBinary;
	}
}
