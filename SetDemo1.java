package bcasem4.collection.basics;

import java.util.*;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<Double> numbers;
		numbers = new LinkedHashSet<Double>();
		
		numbers.add(11.0);
		numbers.add(10.0);
		numbers.add(12.0);
		numbers.add(11.0);
		numbers.add(null);
		numbers.add(new Double(12.0));
		numbers.add(null);
		System.out.println(numbers);
		//double sd = 12;

	}

}
