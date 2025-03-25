import java.util.Scanner;

class MovieTicket {
    // Attributes
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false; // Initially, no seat is booked
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat is already booked. Please choose another seat.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Ticket Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: $" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();
        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        // Creating a movie ticket object
        MovieTicket ticket = new MovieTicket(movie, price);

        // Booking a ticket
        System.out.print("Enter seat number to book: ");
        int seatNumber = scanner.nextInt();
        ticket.bookTicket(seatNumber);

        // Displaying ticket details
        ticket.displayTicketDetails();

        scanner.close();
    }
}
