package main.quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		int num1 = i / 10;
		
		int num2 = i % 10;
		
		int sum = num1 + num2;
		
		System.out.println("10의 자리와 1의 자리의 합은 : "+ sum + " 입니다.");
		
	}
	
}
