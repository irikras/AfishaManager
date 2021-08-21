package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
    private Film[] items = new Film[0];
    private int maxFilms = 10;

    public AfishaManager() {
    }

    public AfishaManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public void addFilm(Film item) {
        int filmLength = items.length + 1;
        Film[] result = new Film[filmLength];
        for (int i = 0; i < items.length; i++) {
            result[i] = items[i];
        }
        int lastIndex = result.length - 1;
        result[lastIndex] = item;
        items = result;
    }

    public Film[] getAllLast() {
        int resultLength;
        if (items.length < maxFilms) {
            resultLength = items.length;

        } else {
            resultLength = maxFilms;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        int filmLength = items.length - 1;
        Film[] tmp = new Film[filmLength];
        int index = 0;
        for (Film item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}




