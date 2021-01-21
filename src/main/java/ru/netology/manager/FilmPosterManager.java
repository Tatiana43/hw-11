package ru.netology.manager;

import ru.netology.domain.FilmPoster;

public class FilmPosterManager {
    private FilmPoster[] items = new FilmPoster[0];
    private int maxFilmLength = 10;

    public FilmPosterManager() {
    }

    public FilmPosterManager(int maxFilmLength) {
        this.maxFilmLength = maxFilmLength;
    }

    public void add(FilmPoster item) {
        int length = items.length + 1;
        FilmPoster[] tmp = new FilmPoster[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public FilmPoster[] getAll() {
        int resultLength = Math.min(maxFilmLength, items.length);
        FilmPoster[] result = new FilmPoster[maxFilmLength];
        for (int i = 0; i < result.length; i++) {

            int index = items.length - i - 1;
            result[i] = items[index];

        }
            return result;
    }
}