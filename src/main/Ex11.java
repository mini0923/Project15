package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		
		// 기반스트림을 사용해서 파일 복사하기
		
		// 시간 측정
		long start = 0;
		long end = 0;
		
		// 출력 스트림 생성
		FileInputStream fis = new FileInputStream("a.txt");
		
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		// 한문자씩 읽어서 복사하는 중
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			fos.write(i);
		}
		
		// 복사가 끝나는 시간 저장
		end = System.currentTimeMillis();
		
		System.out.println("파일을 복사하는데 " + (end - start) + " milliseconds 소요되었습니다.");
		
		
		
	}
	
}
