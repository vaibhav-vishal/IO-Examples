package com.training.ioexamples;

import java.io.Serializable;

public class Book implements Serializable{
 private int bookNumber;
 private String bookName;
 private String author;
 private transient int price;
public int getBookNumber() {
	return bookNumber;
}
public String getBookName() {
	return bookName;
}
public String getAuthor() {
	return author;
}
public int getPrice() {
	return price;
}


public void setBookNumber(int bookNumber) {
	this.bookNumber = bookNumber;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setPrice(int price) {
	this.price = price;
}

public Book(int bookNumber, String bookName, String author, int price) {
	super();
	this.bookNumber = bookNumber;
	this.bookName = bookName;
	this.author = author;
	this.price = price;
}
public Book() {
	super();
System.out.println("Book Initialized");
}
@Override
public String toString() {
	return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + "]";
}


}
