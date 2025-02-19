package day2;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shapes=new Shape[5];
		shapes[0]=new Rectangle(10,5);
		shapes[1]=new Square(4);
		shapes[2]=new Triangle(6,3);
		shapes[3]=new Rectangle(7,3);
		shapes[4]=new Triangle(8,4);
		
		for(Shape i : shapes)
		{
			System.out.println("AREA IS : "+i.calArea());
		}

	}

}
