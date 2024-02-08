package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PrimeNumberUser2 {

	public static void main(String[] args) {
		List<Integer> primeList ;
		//primeList = new ArrayList<Integer>();
		primeList = new Vector<Integer>();
		
		//starting a thread using Runnable 
		Runnable r1 = new PrimeNumberGenerator(101,500, primeList);
		Thread t1 = new Thread(r1);
		t1.start(); // this will make thread t1 ready to run
		
		Thread t2 = new Thread(new PrimeNumberGenerator(1, 100, primeList));
		t2.start(); // this will make thread t1 ready to run
		
		//below code will ececute as a main thread 
//		for(int i=0; i<100; i++) {
//			if(PrimeNumberGenerator.isPrime(i))
//				primeList.add(i);
//		}
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Prime numbers:"+primeList);
		System.out.println("Total Prime numbers:"+primeList.size());
		System.out.println("main ends");
	}

}
