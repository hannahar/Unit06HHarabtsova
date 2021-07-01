package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

public class AllBooks {
	private List<Book> allbooks;

	public AllBooks() {
		allbooks = new ArrayList<Book>();
	}

	public List<Book> getBooks() {
		return allbooks;
	}

	public void setBooks(List<Book> allbooks) {
		this.allbooks = allbooks;
	}

	public void addBook(Book b) {
		allbooks.add(b);
	}

	@Override
	public String toString() {
		return "Found books" + allbooks;
	}

	public List<Book> findByAuthor(String author) {
		List<Book> resultByAuthor = new ArrayList<Book>();

		for (Book b : allbooks) {
			if (b.getAuthor().equals(author)) {
				resultByAuthor.add(b);
			}
		}
		return resultByAuthor;
	}

	public List<Book> findByPublishYear(int year) {
		List<Book> resultByYear = new ArrayList<Book>();

		for (Book c : allbooks) {
			if (c.getPublishYear() >= year) {
				resultByYear.add(c);
			}
		}
		return resultByYear;
	}
}