package threads;

import java.util.ArrayList;

public class PrimeNumberGenerator implements Runnable
{
	private int start, end;
	ArrayList<Integer> primeList;
	
	
	public PrimeNumberGenerator(int start, int end, ArrayList<Integer> primeList) {
		//super();
		this.start = start;
		this.end = end;
		this.primeList = primeList;
	}
	/*
	 * Function to check number is prime or not
	 * returns true if it is a prime otherwise returns false 
	 */
	static boolean isPrime(int n) {
		if(n < 2)
			return false;
		for(int d = 2; d<=n/2; d++) // d is divisor 
		{
			if(n%d == 0)
				return false;
		}
		return true;
	}
	public void run() {
		for(int n=start; n<=end; n++) {
			if(isPrime(n)) //check n is prime or not
				//System.out.println(n+" is a prime");
				primeList.add(n);
			//else
			//	System.out.println(n+" is not a prime");
			
		}
		System.out.println("run() ends");
	}
}
