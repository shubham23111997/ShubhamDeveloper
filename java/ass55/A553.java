import java.lang.*;
import java.util.*;

class ArrayDemo
{
	public int Check(int arr[],int no)
	{
		int i=0,icnt=0,l=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] ==no)
			{
				l=i;
				continue;
			}

		}
		return l;
	}
}

class A553
{
	public static void main(String[] args) 
	{
		ArrayDemo obj1=new ArrayDemo();
		int i=0,no=0;
		int iret=0;
		Scanner obj=new Scanner(System.in);

		System.out.println("Enter Number of elements in array :");
		int value=obj.nextInt();

		System.out.println("Enter Number that want to search in array :");
		no=obj.nextInt();

		int arr[]=new int [value];

		System.out.println("Enter elements of array :");
		for(i=0;i<value;i++)
		{
			arr[i]=obj.nextInt();
		}

		iret=obj1.Check(arr,no);
		System.out.println("last occurance of no is at Index "+iret);
	}
}