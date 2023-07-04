package HYR_OOPs;

public class Student {
	
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}
	
	
	public void setStudentAttendence(boolean flag)                 // Enchapculation principle
	{ 
		isAttended = flag;
		System.out.println("teacher assigned attenden");
	}
	
	
	public boolean getStudentAttendence()
	
	{
		System.out.println("Teacher accessed student");
		return isAttended;
	}

}
