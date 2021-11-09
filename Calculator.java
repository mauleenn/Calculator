package mauleenndlovu.tutorials;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		System.out.println("\n");
		System.out.println("Please enter another number: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println("Enter an operator (+, -, /, *)");
		char operator = input.next().charAt(0);
		double answer;
		
		switch(operator) {
		case '+':
			answer = num1 + num2;
		case '-':
			answer = num1 - num2;
		case '/':
			answer = num1 / num2;
		case '*':
			answer = num1 * num2;
		break;
		default: System.out.println("That's an invalid operator. Please try again.");
		return;
		}
		
		//printing the result of the operations
		System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, answer);
		}
	}
