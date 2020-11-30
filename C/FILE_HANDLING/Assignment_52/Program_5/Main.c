/*
Write a program which accept file name which contains information of student and display the studnt names having even number of marks   
*/

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>
#include<unistd.h>

struct student
{
	int Rollno;
	char Name[20];
	int Marks;
};

void SumofMarks(char *name)
{
	int iRet = 0 , fd = 0, iSum = 0;
	
	struct student sobj;
	
	fd= open(name,O_RDONLY);
	if(fd == -1)
	{
		printf("Unable to open file");
		return;
	}
	
	printf("\n Data from file \n");
	
	while((iRet = read(fd,&sobj,sizeof(sobj)))!=0)
	{
		if((sobj.Marks % 2)== 0)
		{
			printf("Name of students  : %s\n",sobj.Name);
		}
	}
	
	close(fd);
}

int main()
{
	char name[20]= {'\0'};
	
	printf("Enter the name of file\n");
	scanf("%s",name);
	
	SumofMarks(name);
	
	return 0;
}