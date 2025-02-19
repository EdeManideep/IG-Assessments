package day2;

public abstract class Shape {
	protected int length;
	public Shape(int length)
	{
		this.length=length;
	}
	
	public abstract double calArea();
}

class Rectangle extends Shape{
	private int height;
	public Rectangle(int length,int height)
	{
		super(length);
		this.height=height;
	}
	@Override
	public double calArea()
	{
		return length*height;
	}
}

class Square extends Shape{
	public Square(int length)
	{
		super(length);
	}
	@Override
	public double calArea()
	{
		return length*length;
	}
}

class Triangle extends Shape{
	private int height;
	public Triangle(int length,int height)
	{
		super(length);
		this.height=height;
	}
	@Override
	public double calArea()
	{
		return 0.5*length*height;
	}
	
}
