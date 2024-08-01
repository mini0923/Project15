package main;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		
		// File : 파일 정보를 담는 클래스 (활용도가 제일 높다!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있다
		
		// 디렉터리
		File dir = new File("C:\\JeongSeongMin");
		
		System.out.println(dir.isDirectory());		// 폴더인지?
		
		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		for (File f : files) {		
			System.out.println(f.toString());
		}
		
	}
	
}
