package threads.synch;

public class MathUtil {
	synchronized static void printTable(int n) {
		for(int i=1; i<=10; i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
}

 