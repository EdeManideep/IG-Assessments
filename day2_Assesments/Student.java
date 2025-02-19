package day2;

public class Student {
	int rollno;
	String fname;
	
	public Student(int rollno,String fname)
	{
		this.rollno=rollno;
		this.fname=fname;
	}
	public void modify(int num)
	{
		num=num+1;
	}
	public void modify(Student student)
	{
		student.rollno=student.rollno+1;
	}
	public void modify(String newname)
	{
		this.fname=newname;
	}
	public void displayStudentInfo()
	{
		System.out.println("Roll num : "+rollno+", First Name: "+fname);
	}

}
