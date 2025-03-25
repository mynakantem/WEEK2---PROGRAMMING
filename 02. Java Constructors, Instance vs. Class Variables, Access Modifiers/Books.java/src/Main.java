// Book class definition
class Books {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize book details
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // By default, book is available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark book as borrowed
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return book details
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
        System.out.println("----------------------------");
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create book objects
        Books books1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Books books2 = new Books("1984", "George Orwell", 12.50);

        // Display book details
        books1.displayBookDetails();
        books2.displayBookDetails();

        // Borrow a book
        System.out.println("Attempting to borrow 'The Great Gatsby'...");
        books1.borrowBook();

        // Attempt to borrow the same book again
        System.out.println("Trying to borrow 'The Great Gatsby' again...");
        books1.borrowBook();

        // Display book details again to see changes
        books1.displayBookDetails();
    }
}
