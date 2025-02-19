package day4;

import java.util.HashSet;

public class TaskOneMain {

	public static void main(String[] args) {
		TaskOneAddress ad1=new TaskOneAddress("kondapur","Hyderabad","500084");
		TaskOneAddress ad2=new TaskOneAddress("madhapur","Hyderabad","500081");
		
		TaskOneStudent s1=new TaskOneStudent("manideep","ede",22,ad1);
		TaskOneStudent s2=new TaskOneStudent("sai","vaka",26,ad2);
		TaskOneStudent s3=new TaskOneStudent("kushal","kota",20,ad1);
		TaskOneStudent s4=new TaskOneStudent("praveen","kommana",24,ad2);
		
		HashSet<TaskOneStudent> st=new HashSet<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		
		for(TaskOneStudent student:st)
		{
			System.out.println(student.firstName+" "+student.lastName);
		}
	}

}
