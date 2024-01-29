package control_Statement;

import java.util.Scanner;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age :");
		
		age = sc.nextInt();
		
		if((age >=5 )&&(age <= 16))
		{
			System.out.println("School admission is Possible ");
		}
		else if((age >16 )&&(age <= 21))
		{
			System.out.println("College admission is Possible ");
		}
		else 
		{
			System.out.println("Admission not allowed");
		}
		
	}

}
