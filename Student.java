package bcasem4.collection.basics;

public class Student //extends Object 
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
	
	
}
