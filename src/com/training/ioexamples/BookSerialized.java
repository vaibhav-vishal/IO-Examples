package com.training.ioexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookSerialized {

	public String serialize(Book obj){
		String message = null;
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(new File("Book.txt")));
			out.writeObject(obj);
			message = "One object is serialized. Press F5 to view the file.";
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			try {
				out.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
				
		}
		return message;
	}
	public Object deSerialize(){
		Object obj = null;
		
		//ObjectInputStream oin = null;
		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(new File("Book.txt")));){
			obj = oin.readObject();}
		 catch (ClassNotFoundException | IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		return obj;
	}
}
