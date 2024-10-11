package pack;
import java.util.Scanner;
public class j5p1q3 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter First String value:");
		String b=a.next();
		System.out.println("Enter Second String value:");
		String c=a.next();
		int d=b.compareTo(c);
		if(d>0)
		{
			System.out.println(c+" Smallest in albhabetic order.");
		}
		else if(d<0)
		{
			System.out.println(b+" Smallest in albhabetic order.");
		}
		else
		{
			System.out.println("Both String are equal");
	    }
		a.close();
	}

}
