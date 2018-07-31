package movies;

import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    static Scanner sc = new Scanner(System.in);

    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a movie");

        allMoviesOrMovieCategories();

    }

    public static void allMoviesOrMovieCategories() {

        System.out.print("Enter your choice: ");

        String viewMovies = sc.next().toLowerCase();

        System.out.println(" ");

        switch (viewMovies) {

            case "0":
                break;

            case "1":
                System.out.println("All Movies:");
                System.out.println(" ");
                for (int i = 0; i < movies.length; i += 1) {

                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "2":
                System.out.println("All Animated Movies:");
                System.out.println(" ");
                for (int i = 0; i < movies.length; i += 1) {

                    if (movies[i].getCategory().equals("animated")) {

                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "3":
                System.out.println("All Drama Movies:");
                System.out.println(" ");
                for (int i = 0; i < movies.length; i += 1) {

                    if (movies[i].getCategory().equals("drama")) {

                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "4":
                System.out.println("All Horror Movies:");
                System.out.println(" ");
                for (int i = 0; i < movies.length; i += 1) {

                    if (movies[i].getCategory().equals("horror")) {

                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "5":
                System.out.println("All Sci-Fi Movies:");
                System.out.println(" ");
                for (int i = 0; i < movies.length; i += 1) {

                    if (movies[i].getCategory().equals("scifi")) {

                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "6":

                addMovie();

                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            default:
                System.out.println(" ");
                System.out.println("Invalid input");
                System.out.println(" ");
                allMoviesOrMovieCategories();

        }

    }

    public static void addMovie() {

        System.out.println("1 - animated category");
        System.out.println("2 - drama category");
        System.out.println("3 - horror category");
        System.out.println("4 - scifi category");
        System.out.print("Enter the number for the category of the new movie: ");
        sc.nextLine();
        String newMovieCategory = sc.nextLine();

        switch (newMovieCategory) {

            case "1":
                newMovieCategory = "animated";
                break;

            case "2":
                newMovieCategory = "drama";
                break;

            case "3":
                newMovieCategory = "horror";
                break;

            case "4":
                newMovieCategory = "scifi";
                break;

        }

        System.out.println(" ");

        System.out.print("Enter the title of a movie you want to add: ");
        String newMovieName = sc.nextLine();

        Movie newMovie = new Movie(newMovieName, newMovieCategory);

        Movie[] newMovieArr = Arrays.copyOf(movies, movies.length + 1);

        int lastMovie = newMovieArr.length - 1;

        newMovieArr[lastMovie] = newMovie;

        movies = newMovieArr;

    }

}