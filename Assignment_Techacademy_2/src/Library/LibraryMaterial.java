package Library;

public abstract class LibraryMaterial {
	
	    protected String title;
	    protected String author;

	    public LibraryMaterial(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }
	    public abstract void checkout();     
	    public abstract void returnMaterial();
	}



