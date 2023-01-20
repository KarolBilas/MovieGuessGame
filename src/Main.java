import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        double random = Math.random() * 25;
        int selectedMovieNumber = (int) random;
        String selectedMovie;
        int selectedMovieLength;
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
        selectedMovieLength = selectedMovie.length();

        boolean hasWon = false;
        while(!hasWon) {
            System.out.println("Guess the movie name:");
            for (i = 0; i < selectedMovieLength; i++) {
                if (selectedMovie.charAt(i) != ' ') {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
            System.out.println("Choose a letter: ");
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.nextLine();
        }



    }
}