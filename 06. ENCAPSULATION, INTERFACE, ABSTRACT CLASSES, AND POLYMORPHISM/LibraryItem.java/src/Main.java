interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrowerName = null;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    protected void setReserved(boolean status) {
        this.isReserved = status;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Reserved: " + (isReserved ? "Yes" : "No"));
        if (borrowerName != null) {
            System.out.println("Borrower: " + borrowerName);
        }
    }

    public abstract int getLoanDuration(); // in days
}

class Book extends LibraryItem implements Reservable {

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrowerName(borrowerName);
            System.out.println("Book '" + getTitle() + "' reserved by " + borrowerName);
        } else {
            System.out.println("Book '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

class Magazine extends LibraryItem implements Reservable {

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrowerName(borrowerName);
            System.out.println("Magazine '" + getTitle() + "' reserved by " + borrowerName);
        } else {
            System.out.println("Magazine '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

class DVD extends LibraryItem implements Reservable {

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrowerName(borrowerName);
            System.out.println("DVD '" + getTitle() + "' reserved by " + borrowerName);
        } else {
            System.out.println("DVD '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem item2 = new Magazine("M002", "National Geographic", "Various Authors");
        LibraryItem item3 = new DVD("D003", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();
        }

        ((Reservable) item1).reserveItem("Alice");
        ((Reservable) item2).reserveItem("Bob");
        ((Reservable) item3).reserveItem("Charlie");

        System.out.println("\nAfter Reservation:\n");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
            System.out.println();
        }
    }
}
