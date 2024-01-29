package control_Statement;

import java.util.Scanner;

public class Nested_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		a = sc.nextInt();
		
		if(a>=10)
		{
			if(a%2==0)
			{
				System.out.println("It is even number");
			}
			else
			{
				System.out.println("It is Odd number");
			}
		}
		else
		{
			System.out.println("Number is small");
		}
		
		
//		if(num>10 && num%2==0)
//		{
//			System.out.println("even");
//		}
//		else
//		{
//			System.out.println("not even");
//		}
	
	
	}

}
