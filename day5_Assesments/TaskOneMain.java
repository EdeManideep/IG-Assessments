package day5;

import java.util.Scanner;

public class TaskOneMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
				
		try {
			System.out.println("average of first "+n+" natural numbers is : "+calAverage(n));
		}
		catch(TaskOneException e)
		{
			System.out.println("Exception : "+e.getMessage());	
		}
	}
	public static double calAverage(int n) throws TaskOneException
	{
		if(n<=0)
		{
			throw new TaskOneException("input must be a natural number");
		}
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
