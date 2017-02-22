package com.wip.automation.training.exercise6;

import java.time.LocalDate;
import java.util.Arrays;

public class MovieMain {

  public static void main(String[] args) {

    Movie[] movies = new Movie[5];
    movies[0] = new Movie("SuperMan", "Action", LocalDate.of(2012, 07, 24), 110);
    movies[1] = new Movie("Interstellar", "Sci-fi", LocalDate.of(2013, 02, 02), 150);
    movies[2] = new Movie("Pirates", "Adventure", LocalDate.of(2010, 11, 01), 100);
    movies[3] = new Movie("La La Land", "Drama", LocalDate.of(2015, 01, 12), 180);
    movies[4] = new Movie("Moana", "Comedy", LocalDate.of(2014, 06, 26), 150);

    System.out.println(movies);

    int movieCount = movies.length;
    for (int i = 0; i < movieCount; i++) {
      movies[i].printInfo();
    }

    int totalTime = totaltime(movies);
    System.out.println("How long it takes to watch all movies:  " + totalTime + " mins");

    String latestMovie = latest(movies);
    System.out.println("latest movie by release date): " + latestMovie);

    String oldMovie = oldest(movies);
    System.out.println("Oldest movie by release date: " + oldMovie);


  }

  private static String oldest(Movie[] movies) {

    LocalDate[] Dates = new LocalDate[movies.length];
    for (int i = 0; i < movies.length; i++) {
      Dates[i] = movies[i].getReleaseDate();
    }

    Arrays.sort(Dates);
    for (int i = 0; i < movies.length; i++)
      if (movies[i].getReleaseDate().equals(Dates[0]))
        return movies[i].getTitle();

    return null;

  }

  private static String latest(Movie[] movies) {
    LocalDate[] Dates = new LocalDate[movies.length];
    for (int i = 0; i < movies.length; i++) {
      Dates[i] = movies[i].getReleaseDate();
    }

    Arrays.sort(Dates);
    for (int i = 0; i < movies.length; i++)
      if (movies[i].getReleaseDate().equals(Dates[movies.length - 1]))
        return movies[i].getTitle();

    return null;
  }

  private static int totaltime(Movie[] movies) {
    int totMovLen = 0;
    int moviesCount = movies.length;
    for (int i = 0; i < moviesCount; i++)
      totMovLen += movies[i].movieLength;

    return totMovLen;
  }


}
