package main.quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

		public static void main(String[] args) throws IOException {
			
			FileWriter fw = new FileWriter("quiz9.txt");
			
			FileReader fr = new FileReader("quiz9.txt");		
			
			print(fw, fr);	

	}
		
		
		private static void print(FileWriter fw , FileReader fr) throws IOException {
			
			File dir = new File("C:\\Users\\G202\\Downloads");
			
			File[] files = dir.listFiles();
			
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				String name = file.getName();
				fw.write(name+ "\n");
			}
			fw.flush();
			
			while (true) {
				int i = fr.read();	//2바이트씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print((char)i);	// 한글이 제대로 읽어온다.
			}
			
		}
	
}


