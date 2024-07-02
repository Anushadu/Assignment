package Library;

public class LibraryMain {
	    public static void main(String[] args) {
	    	LibrarySystem lbSystem = new LibrarySystem();
			
			lbSystem.AddAudiobookList(new AudioBook("Bob","Business","Alex"));
			lbSystem.AddBookList(new Book("Java","J.Peterson",56));
			lbSystem.AddMagazineList(new Magazine("Eco-System","Lily",10023));
			
			lbSystem.checkoutAudobook();
			lbSystem.checkoutMagazine();
			
			lbSystem.displayMaterials();
			
			

		}

	}



