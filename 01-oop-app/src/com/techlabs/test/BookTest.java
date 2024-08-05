package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Book books[]=new Book[5];
		
		
		for(int i=0;i<books.length;i++)
		{
		System.out.println("Enter Book ID: ");
		int bookId=scanner.nextInt();
		System.out.println("Enter Book Name: ");
		String name=scanner.next();
		System.out.println("Enter Book Author Name: ");
		String author=scanner.next();
		System.out.println("Enter Book Price: ");
		double price=scanner.nextDouble();
		System.out.println("Enter Book Publication: ");
		String publication=scanner.next();
		
		books[i]=new Book(bookId, name, author, price, publication);
		}
		
		for(int i=0;i<books.length;i++)
		{
		System.out.println("Book ID: "+books[i].getBookId());
		System.out.println("Book Name: "+books[i].getName());
		System.out.println("Book Author: "+books[i].getAuthor());
		System.out.println("Book Publication: "+books[i].getPublication());
		System.out.println("Book Price: "+books[i].getPrice());
		}
		
		scanner.close();

	}

}
