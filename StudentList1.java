package bcasem4.collection.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class StudentList1 {
	static void displayStudent(Student stud) {
		System.out.println("Roll No:"+stud.getRollNumber()+", "+
					"Name: "+stud.getName());
	}
	public static void main(String[] args) {
		int rollNos[] = {11,23,45,66,12};
		String []names = {"Anita", "Bina", "Chirag", "Jojo", "Meena"};
 		
		//create list of student
		//Collection<Student> studList = new ArrayList<Student>();
		
		List<Student> studList = new Vector<Student>();
		
		//create and add student into the list 
		for(int i=4; i>=0; i--) {
			Student s1 = new Student(rollNos[i], names[i]);
			studList.add(s1);
		}
		
		//process student list to print data
		for(Student s: studList) {
			//displayStudent(s);
			System.out.println(s.toString());
			//System.out.println(s.toString());
		}
		
		//remove a specific element 
		// e.g. with rollNumber =11
		for(int i = 0; i<studList.size(); i++) {
			Student s = studList.get(i);
			if (s.getRollNumber()==11)
				studList.remove(i);			
		}
		
		studList.add(3, new Student(111,"Madhav"));
		//studList.addAll(studList);
		//studList.removeAll(studList);
		//Students after delete
		System.out.println("After deletetion of student ");
		for(Student s: studList) {
			System.out.println(s.toString());
		}
	
	}

}
