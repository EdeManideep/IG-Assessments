package day4;

import java.util.Objects;

public class TaskOneStudent {
	String firstName;
	String lastName;
	int age;
	TaskOneAddress address;
	public TaskOneStudent(String firstName, String lastName, int age, TaskOneAddress address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true; 
	        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class

	        TaskOneStudent other = (TaskOneStudent) obj;
	        return this.firstName.equals(other.firstName) &&
	               this.lastName.equals(other.lastName) &&
	               this.address.equals(other.address);
	    }

	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(firstName, lastName, address);
	    }
	

	
}
