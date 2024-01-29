package control_Statement;

import java.util.Scanner;

public class If_Condition {

	public static void main(String[] args) {
		
		int age ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
		if(age>5)
		{
			System.out.println("Addmision is Open");
		}
		else
		{
			System.out.println("Addmission is not Open");
		}
	}

}
