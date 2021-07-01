package com.epam.unit06.task03;

public class Book {
	private int id;
	private String author;
	private String name;
	private String publisher;
	private int publishYear;
	private int pageAmount;
	private int price;
	private String bookCover;

	public Book() {
		id = 0;
		name = "";
		author = "";
		publisher = "";
		publishYear = 0;
		pageAmount = 0;
		price = 0;
		bookCover = "";
	}

	public Book(int _id, String _author, String _name, String _publisher, int _publishYear, int _pageAmount, int _price,
			String _bookCover) {
		id = _id;
		author = _author;
		name = _name;
		publisher = _publisher;
		publishYear = _publishYear;
		pageAmount = _pageAmount;
		price = _price;
		bookCover = _bookCover;
	}

	public int findByPublishYear(int byPublishYear) {

		this.publishYear = byPublishYear;
		return this.publishYear;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getPageAmount() {
		return pageAmount;
	}

	public void setPageAmount(int pageAmount) {
		this.pageAmount = pageAmount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookCover() {
		return bookCover;
	}

	public void setBookCover(String bookCover) {
		this.bookCover = bookCover;
	}

	@Override
	public String toString() {
		return "Book_id=" + id + ", author=" + author + ", name=" + name + ", publisher=" + publisher + ", publishYear="
				+ publishYear + ", pageAmount=" + pageAmount + ", price=" + price + ", bookCover=" + bookCover;
	}

}
