package Library;

public class Magazine extends LibraryMaterial{
	 private int issueNumber;
	    public Magazine(String title, String author, int issueNumber) {
	        super(title, author);
	        this.issueNumber = issueNumber;
	    }

	    
	    public void checkout() {
	        System.out.println("Magazine '" + title + "' issue " + issueNumber + " has been checked out.");
	    }
	    public void returnMaterial() {
	        System.out.println("Magazine '" + title + "' issue " + issueNumber + " has been returned.");
	    }

	    public int getIssueNumber() {
	        return issueNumber;
	    }
	}



