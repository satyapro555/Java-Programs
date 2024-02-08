package threads;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator implements Runnable
{
	private int start, end;
	List<Integer> primeList;
	
	
	public PrimeNumberGenerator(int start, int end, List<Integer> primeList) {
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
		int pCount =0;
		for(int n=start; n<=end; n++) {
			//check n is prime or not
			if(isPrime(n)) {
				//System.out.println(n+" is a prime");
				primeList.add(n);
				pCount +=1;
			}
			
		}
		System.out.println("Prime from "+start+" to "+end+" are: "+pCount);
		
		System.out.println("run() ends: ");
	}
}
