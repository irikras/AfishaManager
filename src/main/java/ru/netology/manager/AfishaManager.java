package ru.netology.manager;

import ru.netology.domain.AfishaRepository;
import ru.netology.domain.Film;

public class AfishaManager {
    private AfishaRepository repository;
    private int maxFilms = 10;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public AfishaManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public void addFilm(Film item) {
        repository.save(item);
    }

    public Film[] getAllLast() {
        int resultLength;
        Film[] items = repository.findAll();
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
        repository.removeById(id);
    }
}




