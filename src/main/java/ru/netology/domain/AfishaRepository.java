package ru.netology.domain;

public class AfishaRepository {
    private Film[] items = new Film[0];

    public Film[] findAll() {
        return items;
    }

    public void save(Film item) {
        int filmLength = items.length + 1;
        Film[] result = new Film[filmLength];
        for (int i = 0; i < items.length; i++) {
            result[i] = items[i];
        }
        int lastIndex = result.length - 1;
        result[lastIndex] = item;
        items = result;
    }

    public Film findById(int id) {
        for (Film item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
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

    public void removeAll(int id) {
        items = new Film[0];
    }
}
