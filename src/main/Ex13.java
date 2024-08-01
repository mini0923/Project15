package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		
		// File : 파일 정보를 담는 클래스 (활용도가 제일 높다!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있다
		
		// input.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\JeongSeongMin\\workspace\\Project15\\input.txt");
		
		// 실제 파일 생성
		file.createNewFile();
		
		// 파일 속성 보기
		System.out.println(file.isFile());	
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		
	}
	
}
