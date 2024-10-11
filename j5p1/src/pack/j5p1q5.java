package pack;
import java.util.Scanner;
public class j5p1q5 {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	 System.out.print("Input:");
     String s=a.next();
     System.out.print("Input:");
     String s2=a.next();
     String c="";
     String d="";
     String f="";
     String g="";
    char b[]=s.toCharArray();
    char e[]=s2.toCharArray();
     for(int i=0;i<s.length();i++)
     {
    	 if(b[i]>='A' && b[i]<='Z')
    	 {
    		 c=c+b[i];
    	 }else
    	 {
    		 d=d+b[i];
    	 }
     }
     System.out.println("Output: "+d.concat(c));
     for(int i=0;i<s2.length();i++)
     {
    	 if(e[i]>='A' && e[i]<='Z')
    	 {
    		 f=f+e[i];
    	 }else
    	 {
    		 g=g+e[i];
    	 }
     }
     System.out.println("Output: "+g.concat(f));
    
     a.close();
	}

}
