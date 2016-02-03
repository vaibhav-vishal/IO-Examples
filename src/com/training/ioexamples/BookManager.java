package com.training.ioexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BookManager {
public String addBooks(Book[] bks){
	try {
        PrintWriter out = new PrintWriter(new FileWriter("Books.txt"));
        for (Book book : bks) {
        	 out.println(book);
		}
       
        out.close();
        } 
		catch (FileNotFoundException e){ 
		} 
		catch (IOException e) {
		}
     return null;
	}

public void printBooks(){
	try {
		FileReader fr = new FileReader("Books.txt");
		BufferedReader br = new BufferedReader(fr);
		String line=null;
		try 
		{
			while(( line=br.readLine()) !=null) {
			System.out.println(line); }
		} 
		catch (IOException e) {
		System.out.println(e.getMessage());
		} 
		} 
		catch (FileNotFoundException e) {
		System.out.println(e.getMessage()); 
		}
}
}
