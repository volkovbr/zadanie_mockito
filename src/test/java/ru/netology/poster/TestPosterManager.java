package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPosterManager {
    Poster one = new Poster(1, "film1", 1995);
    Poster two = new Poster(2, "film2", 1999);
    Poster three = new Poster(3, "film3", 2000);
    Poster four = new Poster(3, "film3", 2000);
    Poster five = new Poster(3, "film3", 2000);
    Poster six = new Poster(3, "film3", 2000);
    Poster seven = new Poster(3, "film3", 2000);
    Poster eight = new Poster(3, "film3", 2000);
    Poster nine = new Poster(3, "film3", 2000);
    Poster ten = new Poster(3, "film3", 2000);
    Poster eleven = new Poster(3, "film3", 2000);

    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        Poster[] expected = {one, two, three,four,five,six,seven,eight,nine,ten,eleven};

        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindAllNull() {
        PosterManager manager = new PosterManager();

        Poster[] expected = {};

        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOverLimit() {
        PosterManager manager = new PosterManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Poster[] expected = {eleven, ten, nine,eight,seven,six,five,four,three,two};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastLessLimit() {
        PosterManager manager = new PosterManager();
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Poster[] expected = {eleven, ten, nine,eight,seven,six,five,four,three};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastLimit() {
        PosterManager manager = new PosterManager();
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Poster[] expected = {eleven, ten, nine,eight,seven,six,five,four,three,two};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOverGivenLimit() {
        PosterManager manager = new PosterManager(2);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        Poster[] expected = {three, two};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastNull() {
        PosterManager manager = new PosterManager(2);
        Poster[] expected = {};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
