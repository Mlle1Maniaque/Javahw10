package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.movie.poster.MoviePoster;

public class MovieManagerTest {
    MoviePoster first = new MoviePoster(1, "Бладшот", "боевик");
    MoviePoster second = new MoviePoster(2, "Вперед", "мультфильм");
    MoviePoster third = new MoviePoster(3, "Отель Белград", "комедия");
    MoviePoster fourth = new MoviePoster(4, "Джентельмены", "боевик");
    MoviePoster fifth = new MoviePoster(5, "Человек-невидимка", "ужасы");
    MoviePoster sixth = new MoviePoster(6, "Тролли", "мультфильм");
    MoviePoster seventh = new MoviePoster(7, "Номер один", "комедия");
    MoviePoster eighth = new MoviePoster(8, "Колония Дигнидад", "драма");
    MoviePoster ninth = new MoviePoster(9, "Мы", "ужасы");
    MoviePoster tenth = new MoviePoster(10, "Закрытые пространства", "драма");

    @Test
    public void shouldAddNewMovie() {
        MovieManager manager = new MovieManager(10);

        manager.addNewMovie(first);
        manager.addNewMovie(second);
        manager.addNewMovie(third);

        MoviePoster[] expected = new MoviePoster[]{third, second, first};
        MoviePoster[] actual = manager.getFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetNullMovie() {
        MovieManager manager = new MovieManager(10);

        MoviePoster[] expected = new MoviePoster[]{};
        MoviePoster[] actual = manager.getFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovie() {
        MovieManager manager = new MovieManager(10);

        manager.addNewMovie(first);
        manager.addNewMovie(second);
        manager.addNewMovie(third);
        manager.addNewMovie(fourth);
        manager.addNewMovie(fifth);
        manager.addNewMovie(sixth);
        manager.addNewMovie(seventh);
        manager.addNewMovie(eighth);
        manager.addNewMovie(ninth);
        manager.addNewMovie(tenth);

        MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MoviePoster[] actual = manager.getFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovie() {
        MovieManager manager = new MovieManager(6);

        manager.addNewMovie(first);
        manager.addNewMovie(second);
        manager.addNewMovie(third);
        manager.addNewMovie(fourth);
        manager.addNewMovie(fifth);
        manager.addNewMovie(sixth);
        manager.addNewMovie(seventh);
        manager.addNewMovie(eighth);
        manager.addNewMovie(ninth);
        manager.addNewMovie(tenth);

        MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth, fifth};
        MoviePoster[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNoMovie() {
        MovieManager manager = new MovieManager(10);

        MoviePoster[] expected = new MoviePoster[]{};
        MoviePoster[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
