package movies;

import util.Input;
import java.util.Scanner;

public class MoviesApplication {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

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
                for (int i = 0; i < MoviesArray.findAll().length; i += 1) {

                    System.out.println(MoviesArray.findAll()[i].getName() + " -- " + MoviesArray.findAll()[i].getCategory());

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "2":
                System.out.println("All Animated Movies:");
                System.out.println(" ");
                for (int i = 0; i < MoviesArray.findAll().length; i += 1) {

                    if (MoviesArray.findAll()[i].getCategory().equals("animated")) {

                        System.out.println(MoviesArray.findAll()[i].getName() + " -- " + MoviesArray.findAll()[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "3":
                System.out.println("All Drama Movies:");
                System.out.println(" ");
                for (int i = 0; i < MoviesArray.findAll().length; i += 1) {

                    if (MoviesArray.findAll()[i].getCategory().equals("drama")) {

                        System.out.println(MoviesArray.findAll()[i].getName() + " -- " + MoviesArray.findAll()[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "4":
                System.out.println("All Horror Movies:");
                System.out.println(" ");
                for (int i = 0; i < MoviesArray.findAll().length; i += 1) {

                    if (MoviesArray.findAll()[i].getCategory().equals("horror")) {

                        System.out.println(MoviesArray.findAll()[i].getName() + " -- " + MoviesArray.findAll()[i].getCategory());

                    }

                }
                System.out.println(" ");
                allMoviesOrMovieCategories();
                break;

            case "5":
                System.out.println("All Sci-Fi Movies:");
                System.out.println(" ");
                for (int i = 0; i < MoviesArray.findAll().length; i += 1) {

                    if (MoviesArray.findAll()[i].getCategory().equals("scifi")) {

                        System.out.println(MoviesArray.findAll()[i].getName() + " -- " + MoviesArray.findAll()[i].getCategory());

                    }

                }
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

}