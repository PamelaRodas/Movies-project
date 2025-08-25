import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter movie name: ");
        String name = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter synopsis: ");
        String synopsis = scanner.nextLine();

        
        Movie movie = new Movie(name, director, year, genre, synopsis);
        
        
        movie.displayInfo();
        
        
        System.out.println("Waiting for 3 seconds...");
        movie.waitSeconds(3);
        System.out.println("Thank you for viewing the movie information!");
        
        scanner.close();
    }
}
