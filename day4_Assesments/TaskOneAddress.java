package day4;

import java.util.Objects;

public class TaskOneAddress {

	String street;
	String city;
	String zipCode;
	public TaskOneAddress(String street, String city, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true; 
	        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class

	        TaskOneAddress other = (TaskOneAddress) obj;
	        return this.street.equals(other.street) &&
	               this.city.equals(other.city) &&
	               this.zipCode.equals(other.zipCode);
	    }

	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(street, city, zipCode);
	    }
	
	 
}
