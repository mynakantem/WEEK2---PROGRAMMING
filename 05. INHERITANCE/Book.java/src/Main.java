class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name + ", Bio: " + bio);
    }
}
class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author = new Author("Java Programming", 2023, "John Doe", "An expert in Java programming.");

        // Displaying Book and Author details
        author.displayInfo();
    }
}
