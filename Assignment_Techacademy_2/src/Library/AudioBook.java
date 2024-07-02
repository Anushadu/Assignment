package Library;

public class AudioBook extends LibraryMaterial{
	    private String narrator;

	    public AudioBook(String title, String author, String narrator) {
	        super(title, author);
	        this.narrator = narrator;
	    }

	    public void checkout() {
	        System.out.println("Audiobook '" + title + "' narrated by " + narrator + " has been checked out.");
	    }

	    public void returnMaterial() {
	        System.out.println("Audiobook '" + title + "' narrated by " + narrator + " has been returned.");
	    }
	    public String getNarrator() {
	        return narrator;
	    }
	}



