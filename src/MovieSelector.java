import java.io.IOException;

public class MovieSelector {


    public static void main(String[] args) throws IOException {

        int moviesRuntime [] = {90, 85, 75, 60, 120, 150, 125 };
        int flightDuration = 250;

        selectMovies(moviesRuntime, flightDuration);
    }


    public static void selectMovies(int[] moviesRuntime, int flightDuration) {

        int totalRuntime = flightDuration - 30;
        int tempHighest = 0;
        int movieA = 0;
        int movieB = 0;

        for(int movie = 0; movie < moviesRuntime.length; movie++) {
            if (moviesRuntime[movie] > totalRuntime) {
                break;
            }

            for(int nextMovie = movie + 1; nextMovie < moviesRuntime.length; nextMovie++) {

                if(moviesRuntime[movie] + moviesRuntime[nextMovie] <= totalRuntime &&
                   moviesRuntime[movie] + moviesRuntime[nextMovie] > tempHighest) {

                    tempHighest = moviesRuntime[movie] + moviesRuntime[nextMovie];
                    movieA = movie;
                    movieB = nextMovie;
                }
            }
        }

        System.out.println("MovieA: " + movieA + " MovieB: " + movieB );
    }
}
