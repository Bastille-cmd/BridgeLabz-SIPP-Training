public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket() {
        this.movieName = "";
        this.seatNumber = 0;
        this.price = 0.0;
    }

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();
        m.bookTicket("Inception", 12, 250);
        m.displayTicket();
    }
}