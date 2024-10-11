package pack;

import java.util.Scanner;

class Employee
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	String department;
	int salary;
	void id() {
		System.out.println("Enter the id:");
		id=sc.nextInt();	
		System.out.println("Employee id is: "+id);
	}
	void name() {
		System.out.println("Enter the name:");
		name=sc.next();	
		System.out.println("Employee name is: "+name);
	}
	void depart() {
		System.out.println("Enter the department:");
		department=sc.next();	
		System.out.println("Employee department is: "+department);
	}
	void salary() {
		System.out.println("Enter the salary:");
		salary=sc.nextInt();	
		System.out.println("Employee salary is:"+salary);
	
	}
}

public class j8p1q5 {

	public static void main(String[] args) {
		Employee a=new Employee();
		a.id();
		a.name();
		a.depart();
		a.salary();
	
}
}
