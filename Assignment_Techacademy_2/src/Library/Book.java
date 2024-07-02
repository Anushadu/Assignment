package Library;

	class Book extends LibraryMaterial {
	    private int numberOfPages;

	    public Book(String title, String author, int numberOfPages) {
	        super(title, author);
	        this.numberOfPages = numberOfPages;
	    }
	    public void checkout() {
	        System.out.println("Book '" + title + "' by " + author + " has been checked out.");
	    }

	    public void returnMaterial() {
	        System.out.println("Book '" + title + "' by " + author + " has been returned.");
	    }
	    public int getNumberOfPages() {
	        return numberOfPages;
	    }
	}



