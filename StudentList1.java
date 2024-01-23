package bcasem4.collection.basics;

public class StudentList1 {
	static void displayStudent(Student stud) {
		System.out.println("Roll No:"+stud.getRollNumber()+", "+
					"Name: "+stud.getName());
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "Anisha");
		displayStudent(s1);
		//System.out.println("s1: "+s1);
		

	}

}
