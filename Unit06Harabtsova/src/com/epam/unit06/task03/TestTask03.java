package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

public class TestTask03 {

	public static void main(String[] args) {
		AllBooks s2 = new AllBooks();

		s2.addBook(new Book(1, "George Orwell", "1949", "Secker&Warburg", 1999, 328, 45, "paperback"));
		s2.addBook(new Book(2, "Albert Camus", "The Stranger", "Hamish Hamilton", 1946, 159, 45, "paperback"));
		s2.addBook(new Book(3, "George Orwell", "Animal Farm", "Secker&Warburg", 1945, 112, 45, "paperback"));
		s2.addBook(new Book(4, "Mark Twain", "The Adventure of Tom Sawyer", "SeaWolf", 2008, 270, 45, "ebook"));

// selects by the specified author
		String byAuthor;
		byAuthor = "George Orwell";
		List<Book> s3 = new ArrayList<Book>();
		s3 = s2.findByAuthor(byAuthor);
		// to display the results
		System.out.println(s3.toString());

// selects all books after the specified year	
		int byPublishYear;
		byPublishYear = 2005;
		List<Book> s4 = new ArrayList<Book>();
		s4 = s2.findByPublishYear(byPublishYear);
		// to display the results
		System.out.println();
		System.out.println(s4.toString());
	}

}
