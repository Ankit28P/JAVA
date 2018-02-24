package data;

import java.util.Scanner;

public class calculator {

	public static void main(String args[]) {
		int a,b,result;
		char c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your 1st number: ");
		a = scan.nextInt();
		System.out.println("Enter youyr 2nd number: ");
		b = scan.nextInt();
		System.out.println("Enter operator (+, -, *, /)");
		c = scan.next().charAt(0);
		scan.close();
		
		if(c == '+') {
			result = a+b;
			System.out.print("Result = "+result);
		}
		else if(c == '-') {
			result = a-b;
			System.out.print("Result = "+result);
		}
		else if(c == '*') {
			result = a-b;
			System.out.print("Result = "+result);
		}
		else if(c == '/') {
			result = a/b;
			System.out.print("Result = "+result);
		}
		else {
			System.out.print("Wrong Operator!");
		}
		
	}

}
