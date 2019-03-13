package com.samueljb.main;

import java.math.BigInteger;

public class Run {

	public static void main(String[] args) {
		
		//int z = 0; //Positive
		//int x = 0; //Negative
		//int y = 0; //Negative
	    
	    BigInteger max = new BigInteger("100000000000000000000");
		BigInteger min = new BigInteger("10000000000000000");
		BigInteger maxNeg = new BigInteger("-100000000000000000000");
		BigInteger minNeg = new BigInteger("-10000000000000000");
		BigInteger one = new BigInteger("1");
		BigInteger tenThou = new BigInteger("10000");
		
		BigInteger k = new BigInteger("42");

		BigInteger result = new BigInteger("0");

		for(BigInteger z = new BigInteger(max.toString()); z.compareTo(min) == 1; z = z.subtract(one)) {
				
			for(BigInteger x = new BigInteger(minNeg.toString()); x.compareTo(maxNeg) == 1; x = x.subtract(one)) {

				for(BigInteger y = new BigInteger(minNeg.toString()); y.compareTo(maxNeg) == 1; y = y.subtract(one)) {

					result = (z.pow(3).add(x.pow(3)).add(y.pow(3)));
					
					if(result.compareTo(one) == 1 && result.compareTo(tenThou) == -1) {
						System.out.println(z + " " + x + " " + y + " " + result);
					}
					
					if(result.compareTo(k) == 0) {
						System.out.println(z + " " + x + " " + y + " " + result);
						return;
					}
						
					if(result.compareTo(k) == -1) {
						y = maxNeg;
						x = maxNeg;
					}					
				}
			}
				
		}
	}

}
