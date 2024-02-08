package threads.comunication;

import java.util.LinkedList;

public class Box {
	int capacity;
	LinkedList<Integer> list; 
	public void put(int e)
	{
		if(list.size() < capacity)
			list.add(e);
	}
	public int get()
	{	
		int e=0;
		if(list.size() >0)
			e = list.removeFirst();
		return e;
	}
	
}
