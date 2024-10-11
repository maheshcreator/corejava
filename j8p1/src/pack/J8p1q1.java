package pack;

import java.util.Scanner;
class Calculator1
{
	public int add1(int a,int b) 
	{
        int c=a+b;
		return c;
	}
	public int sub1(int a,int b)
	{
            int c=a-b;
			return c;
	}
	public int multi1(int a,int b)
	{
       int c=a*b;
	   return c;
	}
	public float dev1(int a,int b)
	{
        float c=a/b;
		return c;

	}

}
public class J8p1q1 {

	public static void main(String[] args) {
		Calculator1 cal=new Calculator1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter between 1 to 4 ");
		System.out.println("1.ADDITION.");
		System.out.println("2.SUBRACTION.");
		System.out.println("3.MULTIPLICATION.");
		System.out.println("4.DIVISION.");
		int n=sc.nextInt();
		System.out.println("Enter Two values to do mathematical operation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		switch(n)
		{
		case 1:
			int add=cal.add1(a,b);
			System.out.println("Addition of "+a+" & "+b+" is :"+add);
			break;
		case 2:
			int sub=cal.sub1(a,b);
			System.out.println("Subraction of "+a+" & "+b+" is :"+sub);
			break;
		case 3:
			int mul=cal.multi1(a,b);
			System.out.println("Multiplication of " +a+" & "+b+" is :"+mul);
			break;
		case 4:
			float div=cal.dev1(a,b);
			System.out.println("Division of "+a+" & "+b+" is :"+div);
			break;
	    default:
	        	System.out.println("invalid entry");
			    break;
		}
		sc.close();
	}

}
