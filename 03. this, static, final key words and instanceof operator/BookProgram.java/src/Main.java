// Book Class
class BookProgram {
    // Static variable shared across all books
    static String libraryName = "City Central Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable (cannot be changed)

    // Constructor using 'this' to initialize values
    public BookProgram(String title, String author, String isbn) {
        this.title = title;   // Resolving ambiguity
        this.author = author; // Resolving ambiguity
        this.isbn = isbn;     // Final variable assigned once
    }

    // Method to display book details (uses instanceof)
    public void displayBookDetails() {
        if (this instanceof BookProgram) { // Checking if object is an instance of Book
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

// Main class to test the program
class LibrarySystem {
    public static void main(String[] args) {
        // Display the library name
        BookProgram.displayLibraryName();

        System.out.println("-----------------------------");

        // Creating book objects
        BookProgram BookProgram1 = new BookProgram("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        BookProgram BookProgram2 = new BookProgram("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Displaying book details
        BookProgram1.displayBookDetails();
        System.out.println("-----------------------------");
        BookProgram2.displayBookDetails();
    }
}
