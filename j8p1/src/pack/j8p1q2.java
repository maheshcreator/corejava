package pack;

import java.util.Scanner;

public class j8p1q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius value of a circle:");
		int r=sc.nextInt();
		Circle a1=new Circle();
		a1.input(r);
		float a=a1.area();
		float b=a1.peri();
		System.out.println("Area of a circle: " +a);
		System.out.println("perimeter of a circle: "+b);
		sc.close();

	}

}
