package com.training.ioexamples;

import java.io.*;

public class File_Example {

	public static void main(String[] args) {
		File f = new File("Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
try {
	PrintWriter writer = new PrintWriter(f);
	writer.println("hello");
	writer.close();
	
} catch (FileNotFoundException e) {
	System.out.println(e.getMessage());
}
		
		System.out.println(f.exists());

	}

}
