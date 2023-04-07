package java.java_practice;

public class Book {

	private String book;
	private String author;

	public Book() {

	}

	public Book(String book, String author) {
		this.author = author;
		this.book = book;

	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void info() {

		System.out.println(book + author);
	}

	

}


