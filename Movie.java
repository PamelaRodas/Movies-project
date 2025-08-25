public class Movie {
    private String name;
    private String director;
    private int year;
    private String genre;
    private String synopsis;

   
    public Movie(String name, String director, int year, String genre, String synopsis) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.synopsis = synopsis;
    }

   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Synopsis: " + synopsis);
    }


    public void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }
    }
}
