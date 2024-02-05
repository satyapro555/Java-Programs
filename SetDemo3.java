package bcasem4.collection.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		Set<String> nameSet = null;
		nameSet = new HashSet<String>();
		int n;
		//Read value of n from user
		Scanner sc = new Scanner(System.in);
		System.out.print("How many names: ");
		n = sc.nextInt();
		
		//Add values into names
		System.out.println("Enter "+n+" names");
		for(int i=0; i<n; i++) {
			String name = sc.nextLine();
			nameSet.add(name);
		}
		System.out.println(nameSet);
		
		Iterator<String> it = nameSet.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			System.out.println(name);
		}
	}

}
