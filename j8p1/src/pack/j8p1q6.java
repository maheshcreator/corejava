package pack;

import java.util.Scanner;

class Swap{
	int c=0;
	int swap(int a,int b)
	{
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped:");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		return 0;
		
	}
}
public class j8p1q6 {

	public static void main(String[] args) {
		Swap n=new Swap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        n.swap(a,b);
        sc.close();
	}

}
