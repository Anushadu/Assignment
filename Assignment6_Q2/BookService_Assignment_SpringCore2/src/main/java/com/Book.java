package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Book {

	    private String title;
		private String author;
		private boolean isbn;
		public Book(String title, String author, boolean isbn) {
			super();
			this.title = title;
			this.author = author;
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public boolean isIsbn() {
			return isbn;
		}
		public void setIsbn(boolean isbn) {
			this.isbn = isbn;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
		}
		
	}

