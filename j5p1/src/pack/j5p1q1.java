package pack;
import java.util.Scanner;
public class j5p1q1 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the string value:");
		String b=a.next();
		char c[]=new char[b.length()];
		for(int i=0;i<b.length();i++)
		{
		c[i]=b.charAt(i);
		System.out.println(c[i]);
		}
		
		
a.close();
	}

}
