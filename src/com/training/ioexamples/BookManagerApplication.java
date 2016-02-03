package com.training.ioexamples;

public class BookManagerApplication {

	public static void main(String[] args) {
Book[] bks = new Book[3];
bks[0] = new Book(101, "Maths 101", "Maths teacher", 1000);
bks[1] = new Book(102, "Physics 101", "Physics teacher", 2000);
bks[2] = new Book(103, "Chemistry 101", "Chemistry teacher", 3000);
//bks[3] = new Book(104, "Biology 101", "Biology teacher", 4000);
	
	BookManager bm = new BookManager();
	bm.addBooks(bks);
	bm.printBooks();
	}

}
