package day2;

public class ParamPassingDemo1 {

	public static void main(String[] args) {
		
		Student s=new Student(101,"john");
		int num=5;
		String name="Mike";
		System.out.println("before modifying");
		System.out.println("integer value is "+num);
		s.displayStudentInfo();
		System.out.println("string value is "+name);
		
		
		s.modify(num);
		s.modify(s);
		s.modify("Monika");
		System.out.println("after modifying ");
		System.out.println("integer value is "+num);
		s.displayStudentInfo();
		System.out.println("string value is"+name);
	}
}
