package com.training.ioexamples;

public class SerializeApplication {

	public static void main(String[] args) {

Book book = new Book(101, "Java 101", "Suresh", 2000);

BookSerialized bookserialized = new BookSerialized();

System.out.println(bookserialized.serialize(book));

Book bk = (Book)bookserialized.deSerialize();

System.out.println(bk);
	
	}
}
