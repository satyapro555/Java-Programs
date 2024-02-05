package bcasem4.collection.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentSetDemo4 {

	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Student(31, "Ninad");
		s2 = new Student(12, "Parag");
		s3 = new Student(11, "Ninad");
		
		TreeSet<Student> set1 = new TreeSet<Student>();
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(new Student(23,"Leela"));
		set1.add(new Student(3,"Chirag"));
		set1.add(new Student(20,"Vikas"));
		Iterator<Student> it = set1.iterator();
		
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}
}
