package main.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[] args) {

		int [] arr = new int [5];
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.");
		
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = scanner.nextInt();
			sum = sum + arr[i];			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		
		
		
		
		
	}

}
