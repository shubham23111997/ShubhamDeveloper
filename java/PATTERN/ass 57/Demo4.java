import java.lang.*;
import java.util.*;

class Demo4
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);

		System.out.println("enter  Row Number");
		int value1=obj.nextInt();

		System.out.println("enter  Coloumn Number");
		int value2=obj.nextInt();

		Numbers4 obj1=new Numbers4();

		obj1.pattern1(value1,value2);
	}
}

class Numbers4
{
	void pattern1(int iNo1,int iNo2)
	{
		int i=0,j=0;
		char ch='A';

		System.out.println();

		for(i=1;i<=iNo1;i++)
		{
			for(j=1;j<=iNo2;j++)
			{
				
				System.out.print(ch+"\t");
			}
			System.out.println();
			ch++;
		}
	}
}