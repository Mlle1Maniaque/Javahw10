package ru.netology.manager;

import ru.netology.movie.poster.MoviePoster;

public class MovieManager {
    private MoviePoster[] posters = new MoviePoster[0];
    private int limitMovie;

    public MovieManager(int limitMovie) {
        this.limitMovie = limitMovie;
    }

    public void addNewMovie(MoviePoster poster) {
        MoviePoster[] tmp = new MoviePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public MoviePoster[] getFindAll() {
        MoviePoster[] result = new MoviePoster[posters.length];
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

    public MoviePoster[] getFindLast() {
        int resultLength = limitMovie;
        if (resultLength > posters.length) {
            resultLength = posters.length;
        }
        MoviePoster[] result = new MoviePoster[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }
}
