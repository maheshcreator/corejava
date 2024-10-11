package pack;
import java.util.Scanner;
public class j5p1q2 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=a.nextInt();
	    char b[]=new char[n];
		String c="";
		System.out.println("Enter the char value:");
		for(int i=0;i<b.length;i++)
              {
                b[i]=a.next().charAt(0);
              }
		for(int i=0;i<b.length;i++)
		     {
			    c=c+b[i];
			 }
		System.out.println("Converted into string:");
		System.out.println(c);
		
		a.close();

}
}
