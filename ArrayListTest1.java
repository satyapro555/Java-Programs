package bcasem4.collection.basics;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest1 {

	public static void main(String[] args) {
		Collection<String> strData ;
		
		strData = new ArrayList<String>();
		strData.add("Anita");
		strData.add("Ramesh");
		strData.add("Dinkar");
		strData.add("Neha");
		//use for-each loop
		for(String item: strData)
			System.out.println(item);

	}

}
