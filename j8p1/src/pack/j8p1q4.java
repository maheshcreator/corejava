package pack;

import java.util.Scanner;

class Banking{
	int accbal=10000;
	Scanner sc=new Scanner(System.in);
	int withdraw()
	{
		System.out.println("Enter the Amount to withdraw:");
		int withdraw=sc.nextInt();
		accbal=accbal-withdraw;
		System.out.println("Collect the your cash");
		System.out.println("_________________________________");
		System.out.println("Your Account balance is: "+accbal);
        return 0;	
	}
	int deposit()
	{
		System.out.println("Enter the Amount to deposit:");
		int deposit=sc.nextInt();
		accbal=accbal+deposit;
		System.out.println("Your cash is deposited successfully");
		System.out.println("_____________________________________");
		System.out.println("Your Account balance is: "+accbal);
        return 0;
	}
}
public class j8p1q4 {

	public static void main(String[] args) {
		Banking a=new Banking();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to withdraw:");
		System.out.println("Enter 2 to deposit:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			a.withdraw();
			break;
		case 2:
			a.deposit();
			break;
		default:
			System.out.println("invalid entry please try again");
		}
		sc.close();
}
}
