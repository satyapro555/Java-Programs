package threads;

import java.util.ArrayList;

public class PrimeNumberUser {

	public static void main(String[] args) {
		ArrayList<Integer> primeList ;
		primeList = new ArrayList<Integer>();
		
		//starting a thread using Runnable 
		Runnable r1 = new PrimeNumberGenerator(11,50, primeList);
		Thread t1 = new Thread(r1);
		t1.start(); // this will make thread t1 ready to run
		
		//below code will ececute as a main thread 
		for(int i=0; i<10; i++) {
			if(PrimeNumberGenerator.isPrime(i))
				System.out.println("main(): "+i+" is a prime");
			else
				System.out.println("main(): "+i+" is not a prime");
		}
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Prime numbers:"+primeList);
		System.out.println("main ends");
	}

}
