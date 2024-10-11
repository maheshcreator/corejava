package pack;
import java.util.Scanner;
public class j5p1q4 
{
public static void main(String[] args)
{
		Scanner a=new Scanner(System.in);
		String b[]=new String[5];
		String s1="";
		System.out.println("Enter string value one by one:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=a.next();
		}
		
	    for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				int c=b[i].compareTo(b[j]);
			    if(c>0)
			    {
			    	s1=b[i];
			    	b[i]=b[j];
			    	b[j]=s1;
			    }
			}
		}
	        System.out.println("Your String values in Alphabetic order:");
			for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]);	
			}
		    a.close();
			}
	
}



