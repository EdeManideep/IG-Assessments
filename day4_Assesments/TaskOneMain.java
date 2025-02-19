package day4;

import java.util.HashSet;

public class TaskOneMain {

	public static void main(String[] args) {
		TaskOneAddress ad1=new TaskOneAddress("domalguda","Hyderabad","500038");
		TaskOneAddress ad2=new TaskOneAddress("Nallakunta","Hyderabad","500044");
		
		TaskOneStudent s1=new TaskOneStudent("monika","ayyapu",21,ad1);
		TaskOneStudent s2=new TaskOneStudent("ram","reddy",28,ad1);
		TaskOneStudent s3=new TaskOneStudent("monika","ayyapu",21,ad1);
		TaskOneStudent s4=new TaskOneStudent("monika","ayyapu",24,ad2);
		
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
