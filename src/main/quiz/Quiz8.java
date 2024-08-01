package main.quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz8 {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:\\Users\\G202\\Downloads");
				
		File[] files = dir.listFiles();
		
		FileWriter fw = new FileWriter("quiz8.txt");
		
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName();
			fw.write(name + "\n");
		}
		fw.flush();
		
	
		
	}
	
}
