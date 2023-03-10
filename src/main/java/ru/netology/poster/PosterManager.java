package ru.netology.poster;

public class PosterManager {
    Poster poster=new Poster();
    private Poster[] movies = new Poster[0];
    private int limitMovies = 10;

    public PosterManager() {
        this.limitMovies = 10;
    }

    public PosterManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public void add(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Poster[] findAll() {
        return movies;
    }

    public Poster[] findLast() {
        int resultLength;
        if (movies.length < limitMovies) {
            resultLength = movies.length;
        } else {
            resultLength = limitMovies;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}



