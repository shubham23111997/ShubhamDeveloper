#include<stdio.h>

int Display(int No)
{
	int iDigit=0,iNo=9;
	
    while(No!=0)
    {
		iDigit=No%10;
		if(iNo>iDigit)       //smallDigit
		{
			iNo=iDigit;
			No=No/10;
            Display(No);
		}
		else
		{
			No=No/10; 
			Display(No);
		}
    }
	return iNo;
}

int main()
{
	int No=0,iret=0;
	
	printf("Enter Number : \n");
	scanf("%d",&No);
	
    iret=Display(No);
	printf("small digit in number is :%d",iret);
	
    return 0;
}