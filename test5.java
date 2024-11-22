/*
Design a movie ticket booking application that allows users to browse movies, view showtimes, select seats, 
and book tickets. The application show also allow to display the movies in a theater and a 
single movie in multiple threaters. 
- User can search for a movie based on a movie name which can be in different theatres
- User can search for a theater and check out for different movies 
After the selection of a movie, he can go ahead and book tickets. 

Add feature:
Add fields like actor and actress in the movie class and list out all movies along with its 
theatre given name of actor/actress

Sample Input Output:

Enter user name: Ramesh
Enter user email: ramesh@example.com
1. Search Movie
2. Search Theater
3. Book Ticket
4. Search by Actor/Actress
5. Exit
Enter your choice: 1
Enter movie name to search: Baahubali
Found movies:
Title: Baahubali, Duration: 2h 39m, Genre: Action, Actor: Prabhas, Actress: Anushka Shetty
1. Search Movie
2. Search Theater
3. Book Ticket
4. Search by Actor/Actress
5. Exit
Enter your choice: 2
Enter theater name to search: PVR Cinemas
Movies in PVR Cinemas:
Title: Baahubali, Duration: 2h 39m, Genre: Action, Actor: Prabhas, Actress: Anushka Shetty
Title: Arjun Reddy, Duration: 3h 2m, Genre: Drama, Actor: Vijay Deverakonda, Actress: Shalini Pandey
Title: Ala Vaikunthapurramuloo, Duration: 2h 45m, Genre: Action/Drama, Actor: Allu Arjun, Actress: Pooja Hegde
1. Search Movie
2. Search Theater
3. Book Ticket
4. Search by Actor/Actress
5. Exit
Enter your choice: 4
Enter actor/actress name to search: Vijay Deverakonda
Movies with Vijay Deverakonda:
Title: Arjun Reddy, Duration: 3h 2m, Genre: Drama, Actor: Vijay Deverakonda, Actress: Shalini Pandey
Title: Geetha Govindam, Duration: 2h 28m, Genre: Romance/Drama, Actor: Vijay Deverakonda, Actress: Rashmika Mandanna
1. Search Movie
2. Search Theater
3. Book Ticket
4. Search by Actor/Actress
5. Exit
Enter your choice: 3
Enter showtime details to book a ticket (e.g., '6:00 PM' for Baahubali at PVR Cinemas): 6:00 PM
Enter seat number to book: 10
Ticket booked successfully:
Showtime: Time: 6:00 PM, Movie: Baahubali, Theater: Name: PVR Cinemas, Location: Banjara Hills, Seat: 10, User: Ramesh
1. Search Movie
2. Search Theater
3. Book Ticket
4. Search by Actor/Actress
5. Exit
Enter your choice: 5
Exiting the system.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Movie class
class Movie {
    private String title;
    private String duration;
    private String genre;

    public Movie(String title, String duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return "Title: " + title + ", Duration: " + duration + ", Genre: " + genre;
    }
}

// Theater class
class Theater {
    private String name;
    private String location;
    private List<Movie> movies;

    public Theater(String name, String location) {
        this.name = name;
        this.location = location;
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public String getDetails() {
        return "Name: " + name + ", Location: " + location;
    }
}

// Showtime class
class Showtime {
    private String time;
    private Movie movie;
    private Theater theater;
    private List<Seat> seats;

    public Showtime(String time, Movie movie, Theater theater, int numberOfSeats) {
        this.time = time;
        this.movie = movie;
        this.theater = theater;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= numberOfSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (!seat.isBooked()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    public boolean bookSeat(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber && !seat.isBooked()) {
                seat.book();
                return true;
            }
        }
        return false;
    }

    public String getDetails() {
        return "Time: " + time + ", Movie: " + movie.getTitle() + ", Theater: " + theater.getDetails();
    }
}

// Seat class
class Seat {
    private int seatNumber;
    private boolean isBooked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        isBooked = true;
    }

    public boolean isAvailable() {
        return !isBooked;
    }
}

// Ticket class
class Ticket {
    private Showtime showtime;
    private Seat seat;
    private User user;

    public Ticket(Showtime showtime, Seat seat, User user) {
        this.showtime = showtime;
        this.seat = seat;
        this.user = user;
    }

    public String getDetails() {
        return "Showtime: " + showtime.getDetails() + ", Seat: " + seat.getSeatNumber() + ", User: " + user.getName();
    }
}

// User class
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Movie> searchMovie(List<Theater> theaters, String movieName) {
        List<Movie> foundMovies = new ArrayList<>();
        for (Theater theater : theaters) {
            for (Movie movie : theater.getMovies()) {
                if (movie.getTitle().equalsIgnoreCase(movieName)) {
                    foundMovies.add(movie);
                }
            }
        }
        return foundMovies;
    }

    public List<Movie> searchTheater(List<Theater> theaters, String theaterName) {
        for (Theater theater : theaters) {
            if (theater.getDetails().contains(theaterName)) {
                return theater.getMovies();
            }
        }
        return new ArrayList<>();
    }

    public Ticket bookTicket(Showtime showtime, int seatNumber) {
        if (showtime.bookSeat(seatNumber)) {
            Seat seat = new Seat(seatNumber);
            return new Ticket(showtime, seat, this);
        }
        return null;
    }
}

// BookingSystem class
class BookingSystem {
    private List<User> users;
    private List<Theater> theaters;

    public BookingSystem() {
        this.users = new ArrayList<>();
        this.theaters = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addTheater(Theater theater) {
        theaters.add(theater);
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        Scanner scanner = new Scanner(System.in);

        // Initialize data (usually, this would be loaded from a database or another source)
        Movie movie1 = new Movie("Inception", "2h 28m", "Sci-Fi");
        Movie movie2 = new Movie("Interstellar", "2h 49m", "Sci-Fi");
        Theater theater1 = new Theater("Regal Cinema", "Downtown");
        Theater theater2 = new Theater("AMC Theaters", "Uptown");

        theater1.addMovie(movie1);
        theater1.addMovie(movie2);
        theater2.addMovie(movie1);

        bookingSystem.addTheater(theater1);
        bookingSystem.addTheater(theater2);

        Showtime showtime1 = new Showtime("6:00 PM", movie1, theater1, 100);
        Showtime showtime2 = new Showtime("8:00 PM", movie2, theater1, 100);
        Showtime showtime3 = new Showtime("7:00 PM", movie1, theater2, 100);

        // User input for booking process
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter user email: ");
        String userEmail = scanner.nextLine();
        User user = new User(userName, userEmail);
        bookingSystem.addUser(user);

        while (true) {
            System.out.println("\n1. Search Movie");
            System.out.println("2. Search Theater");
            System.out.println("3. Book Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter movie name to search: ");
                    String movieName = scanner.nextLine();
                    List<Movie> foundMovies = user.searchMovie(bookingSystem.getTheaters(), movieName);
                    System.out.println("Found movies:");
                    for (Movie movie : foundMovies) {
                        System.out.println(movie.getDetails());
                    }
                    break;

                case 2:
                    System.out.print("Enter theater name to search: ");
                    String theaterName = scanner.nextLine();
                    List<Movie> theaterMovies = user.searchTheater(bookingSystem.getTheaters(), theaterName);
                    System.out.println("Movies in " + theaterName + ":");
                    for (Movie movie : theaterMovies) {
                        System.out.println(movie.getDetails());
                    }
                    break;

                case 3:
                    System.out.print("Enter showtime details to book a ticket (e.g., '6:00 PM' for Inception at Regal Cinema): ");
                    String showtimeDetails = scanner.nextLine();
                    Showtime selectedShowtime = null;
                    if (showtimeDetails.equals("6:00 PM")) {
                        selectedShowtime = showtime1;
                    } else if (showtimeDetails.equals("8:00 PM")) {
                        selectedShowtime = showtime2;
                    } else if (showtimeDetails.equals("7:00 PM")) {
                        selectedShowtime = showtime3;
                    }

                    if (selectedShowtime != null) {
                        System.out.print("Enter seat number to book: ");
                        int seatNumber = scanner.nextInt();
                        Ticket ticket = user.bookTicket(selectedShowtime, seatNumber);
                        if (ticket != null) {
                            System.out.println("Ticket booked successfully:");
                            System.out.println(ticket.getDetails());
                        } else {
                            System.out.println("Failed to book ticket.");
                        }
                    } else {
                        System.out.println("Invalid showtime details.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}


