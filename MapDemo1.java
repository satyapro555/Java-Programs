package bcasem4.collection.basics;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		//  keytype  ValueType
		Map<Integer, String> map =new  LinkedHashMap<Integer, String>();
		
		//putting values into map 
		//map.put(null, null);
		map.put(null, "Neha");
		map.put(12, "Ninad");
		map.put(22, "Ranjan");
		map.put(32, "Ranjan");
		map.put(11, "Lalit");
		
		//to get a value with specific key 
		System.out.println("map<11>: "+map.get(11) );
		
		//reading all avalues 
		Collection<String> valuesSet =  map.values();
		System.out.println("All Values: "+valuesSet);		

		//reading keys from map
		Set<Integer> keySet =  map.keySet();
		for(Integer key:keySet)
		{
			System.out.println("["+key+","+map.get(key)+"]");
		}
		
		
		// System.out.println("All key and values associated with keys are :");
		
		// Enumeration<Integer> enumKeys = map.keys();
		// //enumKeys.
		
		// while(enumKeys.hasMoreElements())
		// {	Integer key = enumKeys.nextElement();
		// 	System.out.println("["+key+","+map.get(key)+"]");
		// }
		//map.
	}

}
