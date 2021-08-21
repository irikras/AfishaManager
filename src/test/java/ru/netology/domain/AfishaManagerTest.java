package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private Film first = new Film(1, "first", "drama");
    private Film second = new Film(2, "second", "comedy");
    private Film third = new Film(3, "third", "horror");
    private Film fourth = new Film(4, "fourth", "cartoon");
    private Film fifth = new Film(5, "fifth", "love story");
    private Film sixth = new Film(6, "sixth", "drama");
    private Film seventh = new Film(7, "seventh", "horror");
    private Film eighth = new Film(8, "eighth", "comedy");
    private Film ninth = new Film(9, "ninth", "love story");
    private Film tenth = new Film(10, "tenth", "cartoon");

    @BeforeEach
    public void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
    }

    @Test
    public void shouldShowTenFilms() {
        Film[] actual = manager.getAllLast();
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
