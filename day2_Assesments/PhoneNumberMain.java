package day2;

public class PhoneNumberMain {
    public static void main(String[] args) {
        
    	
        PhoneNumber p1= new PhoneNumber("700","897","8609");
        PhoneNumber p2= new PhoneNumber("700","897","8609");
        PhoneNumber p3=new PhoneNumber("900","345","2345");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
