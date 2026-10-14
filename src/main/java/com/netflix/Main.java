package com.netflix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Your code starts here
        System.out.println("Netflix 2.0\n");

//        Data Types for answers below

        String favMovie = "Spiderman Brand New Day";
        int movieYear = 2026;
        String favMovieGenre = "Action";
        float movieDuration = 2.4167f;
        double timesWatched = 2.5;
        String streamingPlatform = "Netflix";
        int hoursPerWeek = 7;
        float movieRating = 9.0f;
        boolean shouldWatch = true;

        System.out.println("My current favorite movie is " + favMovie);
        System.out.println("The genre is " + favMovieGenre + " and the year it came out is " + movieYear + ".");
        System.out.println("I have watched this movie " + timesWatched + " times. (I may have fallen asleep during one.)");
        System.out.println("The duration of this movie is " + movieDuration + " hours long or 145 minutes.");
        System.out.println("My overall rating for this movie would be a " + movieRating + ". Would I recommend this movie? " + shouldWatch);

        System.out.println("My streaming platform of choice however, is " + streamingPlatform + " which will not have this movie.");
        System.out.println("I typically spend " + hoursPerWeek + " on the platform. Usually when I need a break from work.\n");
/*
        System.out.println("=================");
        System.out.println("Bonus Question");
        System.out.println("=================");

        double hoursPerMonth = 30.8;
        String funFactMovies = "I enjoy horror movies, but still have to hide behind my hands c:";
*/
//        Example of an Array at work (Lists)

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar: The Last Airbender 2026");
        movies.add("Howl's Moving Castle");
        movies.add("Wizard of Oz");
        movies.add("Ju-on");

        System.out.println(movies);


    }
}
