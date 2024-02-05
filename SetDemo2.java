package bcasem4.collection.basics;

import java.util.*;

public class SetDemo2 {

	public static void main(String[] args) {
		SortedSet<String> stringValues;
		stringValues = new TreeSet<String>();
		
		stringValues.add("Abhay");
		stringValues.add("10.11");
		stringValues.add("abhay");
		stringValues.add("Ninad");
		//stringValues.add(null);
		stringValues.add(new String("12.0"));
		//numbers.add(null);
		System.out.println(stringValues);
	

	}

}
