package pack;

import java.util.Scanner;

class Student
{
	Scanner sc=new Scanner(System.in);
	public int marks()
	{
		System.out.println("Enter the marks:");
		System.out.println("Tamil:");
		int tamil=sc.nextInt();
		System.out.println("English:");
		int english=sc.nextInt();
		System.out.println("Maths:");
		int maths=sc.nextInt();
		System.out.println("Science:");
		int science=sc.nextInt();
		System.out.println("Social:");
		int social=sc.nextInt();
		int Total=tamil+english+maths+science+social;
		System.out.println("Total Marks you obtained: "+Total);
		return Total;
	}
	int average(int a)
	{
		System.out.println("Enter Total no.of.subjects");
		int subjects=sc.nextInt();
		int average=a/subjects;
		System.out.println("Your Average is :"+average);
		return 0;
}
}
public class J8p1q3 
{
public static void main(String[] args) 
{
     Student a=new Student();
     
     int b=a.marks();
     a.average(b);
}
}
