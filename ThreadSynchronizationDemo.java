package threads.synch;

public class ThreadSynchronizationDemo {

	public static void main(String[] args) {
		MathUtil mathUtil = new MathUtil();
		Thread t1, t2;
		t1 = new Thread(new MyRunnable(mathUtil,11));
		t2 = new Thread(new MyRunnable(mathUtil,4));
		t1.start();
		t2.start();
		System.out.println("main ends");
	}

}
