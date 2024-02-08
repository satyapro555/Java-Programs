package threads;
class MyThread extends Thread{
	int start, end;
	
	
	public MyThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	public void run() {
		System.out.println("MyThread.run() begins");
		int i =start ;
		while(i<end) {
			System.out.println("MyThread.run(): i="+i);
			i++;
		}
	}
}

public class Threademo {

	public static void main(String[] args) {
		int i=0;
		System.out.println("main() begins");
		// read start and end from user and pass
		int start=111;
		int end = 120;
		Thread t1 = new MyThread(start,end);
		//t1.run(); // method responsible to run a thread 
		t1.start(); // make therad ready to run 
		while(i<10) {
			System.out.println("main: i="+i);
			i++;
		}
		System.out.println("main() ends");

	}

}
