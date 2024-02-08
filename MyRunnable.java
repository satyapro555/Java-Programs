package threads.synch;

public class MyRunnable implements Runnable {
	MathUtil mathUtil;
	int number;
	public MyRunnable(MathUtil mathUtil, int number) {
		this.mathUtil = mathUtil;
		this.number = number;
	}

	@Override
	public void run() {
		mathUtil.printTable(number);
	}

}
