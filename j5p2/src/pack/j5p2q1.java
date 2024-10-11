package pack;

import java.util.Scanner;

public class j5p2q1 {

	public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("Enter the user name: ");
    String user=a.next(); 
    System.out.println("Enter the Password: ");
    String pswd=a.next();
    System.out.println("Your Username is: ");
    System.out.println(user);
    System.out.println("Your password is: ");
    System.out.println(pswd);
    System.out.println("Enter the login user name: ");
    String loginu=a.next();
    System.out.println("Enter the password: ");
    String loginp=a.next();
    if(user.equals(loginu) && pswd.equals(loginp))
    {
    	System.out.println("Login Success");
    }
    else
    {
    	System.out.println("Invalid username or password");
    }
    a.close();
	}

}
