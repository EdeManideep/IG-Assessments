package day5;

public class Main {
    public static void main(String[] args) {
        try {
            
            Stack contactStack = new Stack(3);

           
            Contact contact1 = new Contact("John", "A", "Doe", "01/01/1990", "Male", "1234567890");
            Contact contact2 = new Contact("Jane", "B", "Smith", "02/02/1992", "Female", "0987654321");
            Contact contact3 = new Contact("Alice", "C", "Johnson", "03/03/1993", "Female", "1122334455");
            Contact contact4 = new Contact("Bob", "D", "Brown", "04/04/1994", "Male", "6677889900");

         
            contactStack.push(contact1);
            contactStack.push(contact2);
            contactStack.push(contact3);

          
            try {
                contactStack.push(contact4);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

           
            System.out.println("Popped: " + contactStack.pop().getFirstName());
            System.out.println("Popped: " + contactStack.pop().getFirstName());
            System.out.println("Popped: " + contactStack.pop().getFirstName());

            try {
                contactStack.pop();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
