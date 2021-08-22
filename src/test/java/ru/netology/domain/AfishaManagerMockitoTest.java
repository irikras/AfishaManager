package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerMockitoTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
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
    private Film eleventh = new Film(11, "eleven", "comedy");

    @Test
    public void shouldShowFiveFilms() {
        Film[] returned=new Film[]{first, second, third, fourth, fifth};
        doReturn(returned).when(repository).findAll();

        Film[]expected=new Film[]{fifth, fourth, third, second,first};
        Film[]actual=manager.getAllLast();

        assertArrayEquals(expected, actual);

        Mockito.verify(repository).findAll();
    }

    @Test
    public void shouldShowMaxFilms() {
        Film[] returned=new Film[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        doReturn(returned).when(repository).findAll();

        Film[]expected=new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second,first};
        Film[]actual=manager.getAllLast();

        assertArrayEquals(expected, actual);

        Mockito.verify(repository).findAll();
    }


}
