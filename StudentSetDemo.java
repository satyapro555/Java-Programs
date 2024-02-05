package bcasem4.collection.basics;

public class StudentSetDemo {

	public static void main(String[] args) {
		Student s1, s2;
		s1 = new Student(11, "Ninad");
		s2 = new Student(12, "Parag");
		//System.out.println("s1: "+s1);
		//System.out.println("s1.hashCode(): "+s1.hashCode());
		String str1 , str2 = new String("Hello");
		str1 = new String("Hello");
		if(str1 == str2)
			System.out.println("str1 == str2");
		else 
			System.out.println("str1 != str2");
	
		if(str1.equals(str2))
			System.out.println("str1 equals str2");
		else 
			System.out.println("str1 not equals str2");
		
		if(str1.hashCode() == str2.hashCode())
			System.out.println("str1 and str2 hashcodes are same");
		else 
			System.out.println("str1 and hashcodes are not same");
	
	}
/*
 * 
 *  s1: bcasem4.collection.basics.Student@3d012ddd
	s1.hashCode(): 1023487453
 */
}
