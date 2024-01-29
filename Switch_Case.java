package control_Statement;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the caracter :");
		
		ch = sc.next().charAt(0);
		
		switch (ch)
		{
		case 'a':
		case 'A':
			System.out.println("Its a Vowel");
			break;
	
		case 'e':
		case 'E':
			System.out.println("Its a Vowel");
			break;
			
		case 'i':
		case 'I':
			System.out.println("Its a Vowel");
			break;
			
		case 'o':
		case 'O':
			System.out.println("Its a Vowel");
			break;
			
		case 'u':
		case 'U':
			System.out.println("Its a Vowel");
			break;
			
		default:
			System.out.println("Its not a Vowel");
		}
		
	}

}
