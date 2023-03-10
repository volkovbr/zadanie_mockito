package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPosterManager {
    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] expected = {"film1", "film2", "film3"};

        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        PosterManager manager = new PosterManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastUpMax() {
        PosterManager manager = new PosterManager(2);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        String[] expected = {"film3", "film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
