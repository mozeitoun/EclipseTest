package week2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		int first = 0;
		int second = 0;
		char operator;
		float answer = 0;
		
		Scanner looking = new Scanner(System.in);
		
		System.out.println("First number");
		first= looking.nextInt();
		
		System.out.println("Second number");
		second= looking.nextInt();
		
		System.out.println("Choose Operator");
		operator = looking.next().charAt(0);
		
		
		switch (operator){
			
			
			case '+' : answer = first + second;
			break;
			
			case '-' : answer = first - second;
			break;
			
			case '*' : answer =  first * second;
			break;
			
			case '/' : answer = first / second;
			break;
			
			default : 
			
			
			
		}
		
		System.out.println(first+" " +operator+" " +second+ "is" +answer);
		System.out.println("That's your answer");
		}
		
	

	}	


