package ru.netology.poster;

public class PosterManager {
    private String[] movies = new String[0];
    private int limitMovies = 10;

    public PosterManager() {
        this.limitMovies = 10;
    }

    public PosterManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limitMovies) {
            resultLength = movies.length;
        } else {
            resultLength = limitMovies;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}



