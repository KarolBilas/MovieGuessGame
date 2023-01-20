import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        double random = Math.random() * 25;
        int selectedMovieNumber = (int) random;
        String selectedMovie;
        String[] movieList = new String[25];

        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);

        int i = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            movieList[i] = line;

            i++;
        }
        selectedMovie = movieList[selectedMovieNumber];
        System.out.printf(selectedMovie);
    }
}