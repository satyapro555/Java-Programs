package bcasem4.collection.basics;

public class StudentSetDemo2 {

	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Student(11, "Ninad");
		s2 = new Student(11, "Parag");
		s3 = new Student(11, "Ninad");
		
		if(s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		if(s1 == s3)
			System.out.println("s1 == s3");
		else
			System.out.println("s1 != s3");
	
		if(s1.equals(s3) )
			System.out.println("s1 equals s3");
		else
			System.out.println("s1 not equals s3");
	
	}
/*
 * 
 *  s1: bcasem4.collection.basics.Student@3d012ddd
	s1.hashCode(): 1023487453
 */
}
