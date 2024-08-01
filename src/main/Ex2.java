package main;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 생성자에 표준입력 스트림을 인자로 넣기!
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
		System.out.println("이름 : " + name  + ", 나이 : " + age);
		
		
		
		
		
		
	}
	
}
