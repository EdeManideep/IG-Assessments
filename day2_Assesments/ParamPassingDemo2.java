package day2;

import java.util.Scanner;

public class ParamPassingDemo2 {

	public static void swap(int a,int b)
	{
		System.out.println("before swapping : "+a+" , "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping "+a+" , "+b);
	}
	
	public static void swap(int[] nums1,int[] nums2)
	{
		System.out.println("before swapping"+java.util.Arrays.toString(nums1)+" , "+java.util.Arrays.toString(nums2));
		
		int[] temp=nums1;
		nums1=nums2;
		nums2=temp;
        System.out.println("after swapping "+java.util.Arrays.toString(nums1)+" , "+java.util.Arrays.toString(nums2));

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		swap(x,y);
		
		int[] arr1= new int[5];//{1,2,3,4,5};
		int[] arr2= new int[5];
		System.out.println("enter 5 array-1 elements");
		for(int i=0;i<5;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter 5 array-2 elements");
		for(int i=0;i<5;i++)
		{
			arr2[i]=sc.nextInt();
		}
		swap(arr1,arr2);

}
}
