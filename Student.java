package bcasem4.collection.basics;

public class Student extends Object //implements Comparable<Student>
{
	private int rollNumber;
	private String name;
	
	public Student(int rollNumber, String name) {
		//super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@Override
	public String toString() {
		return "Student [" + rollNumber + ", " + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("student.equals() invoked");
		Student s2 = (Student)obj;
		
		if (this.rollNumber == s2.rollNumber)
			//return true;
			return this.name.equals(s2.name);
		else
			return false;
		//return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("student.hashCode() invoked");
		return rollNumber+name.hashCode();
		//return super.hashCode();
	}

/*	@Override
	public int compareTo(Student s) {
		int rollNo1, rollNo2;
		rollNo1 = this.rollNumber;
		rollNo2 = s.rollNumber;
		if (rollNo1 < rollNo2)
			return -1;
		else if (rollNo1 > rollNo2)
			return 1;
		return 0;
		//return this.rollNumber - s.rollNumber;
	}
*/	
//	@Override
//	public int compareTo(Student s) {
//		return this.name.compareTo(s.name);
//	}
	
	
}
