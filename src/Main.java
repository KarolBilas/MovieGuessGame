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

        String letters = "";
        boolean hasWon = false;
        int tries = 10;
        while(!hasWon) {
            System.out.println("Guess the movie name! You have " + tries + "chances remaining");
            for (i = 0; i < selectedMovieLength; i++) {
                String letterCheck = "";
                letterCheck += selectedMovie.charAt(i);

                if(letters.contains(letterCheck)){
                   System.out.print(selectedMovie.charAt(i));
                }
                else if (selectedMovie.charAt(i) != ' ') {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
           System.out.println("Choose a letter: ");
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.nextLine().charAt(0);
            letters += letter;



        }



    }
}