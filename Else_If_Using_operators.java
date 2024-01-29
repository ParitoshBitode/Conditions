package control_Statement;

import java.util.Scanner;

public class Else_If_Using_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		
		ch = sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Its a vowel");
		}
		else 
		{				
			System.out.println("Its not a vowel");	
		}
	}

}
