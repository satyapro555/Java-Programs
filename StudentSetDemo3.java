package bcasem4.collection.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSetDemo3 {

	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Student(11, "Ninad");
		s2 = new Student(12, "Parag");
		s3 = new Student(11, "Ninad");
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		Iterator<Student> it = set1.iterator();
		
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}
/*
 * 
 *  s1: bcasem4.collection.basics.Student@3d012ddd
	s1.hashCode(): 1023487453
 */
}
