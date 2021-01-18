package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmPoster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmPosterManagerTest {

    @Test
    public void shouldAddTenFilms() {
        FilmPosterManager manager = new FilmPosterManager();

        FilmPoster first = new FilmPoster(1, "pictureUrl1", "Блэдшот", "боевик", false);
        FilmPoster second = new FilmPoster(2, "pictureUrl2", "Вперёд", "мультфильм", false);
        FilmPoster third = new FilmPoster(3, "pictureUrl3", "Отель «Белград» ", "комедия", false);
        FilmPoster fourth = new FilmPoster(4, "pictureUrl4", "Джентельмены", "боевик", false);
        FilmPoster fifth = new FilmPoster(5, "pictureUrl5", "Человек-невидимка", "ужасы", false);
        FilmPoster sixth = new FilmPoster(6, "pictureUrl6", "Тролли. Мировой тур", "мультфильм", true);
        FilmPoster seventh = new FilmPoster(7, "pictureUrl7", "Номер один", "комедия", true);
        FilmPoster eighth = new FilmPoster(8, "pictureUrl8", "Обратная связь", "комедия", false);
        FilmPoster ninth = new FilmPoster(9, "pictureUrl9", "Довод", "триллер", false);
        FilmPoster tenth = new FilmPoster(10, "pictureUrl10", "Чудо=женщина 1984", "фэнтези", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.getAll();

        FilmPoster[] actual = manager.getAll();
        FilmPoster[] expected = new FilmPoster[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


@Test
public void shouldAddFourFilms() {
    FilmPosterManager manager = new FilmPosterManager(4);

    FilmPoster first = new FilmPoster(1, "pictureUrl1", "Блэдшот", "боевик", false);
    FilmPoster third = new FilmPoster(3, "pictureUrl3", "Отель «Белград» ", "комедия", false);
    FilmPoster ninth = new FilmPoster(9, "pictureUrl9", "Довод", "триллер", false);
    FilmPoster tenth = new FilmPoster(10, "pictureUrl10", "Чудо=женщина 1984", "фэнтези", true);
    manager.add(first);
    manager.add(third);
    manager.add(ninth);
    manager.add(tenth);

    manager.getAll();

    FilmPoster[] actual = manager.getAll();
    FilmPoster[] expected = new FilmPoster[]{tenth, ninth, third, first};

    assertArrayEquals(expected, actual);
}

    @Test
    public void shouldNotHaveElevenFilms() {
        FilmPosterManager manager = new FilmPosterManager();

        FilmPoster first = new FilmPoster(1, "pictureUrl1", "Блэдшот", "боевик", false);
        FilmPoster second = new FilmPoster(2, "pictureUrl2", "Вперёд", "мультфильм", false);
        FilmPoster third = new FilmPoster(3, "pictureUrl3", "Отель «Белград» ", "комедия", false);
        FilmPoster fourth = new FilmPoster(4, "pictureUrl4", "Джентельмены", "боевик", false);
        FilmPoster fifth = new FilmPoster(5, "pictureUrl5", "Человек-невидимка", "ужасы", false);
        FilmPoster sixth = new FilmPoster(6, "pictureUrl6", "Тролли. Мировой тур", "мультфильм", true);
        FilmPoster seventh = new FilmPoster(7, "pictureUrl7", "Номер один", "комедия", true);
        FilmPoster eighth = new FilmPoster(8, "pictureUrl8", "Обратная связь", "комедия", false);
        FilmPoster ninth = new FilmPoster(9, "pictureUrl9", "Довод", "триллер", false);
        FilmPoster tenth = new FilmPoster(10, "pictureUrl10", "Чудо=женщина 1984", "фэнтези", true);
        FilmPoster eleventh = new FilmPoster(11, "pictureUrl11", "Семейка Крудс", "мультфильм", false);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        manager.getAll();

        FilmPoster[] actual = manager.getAll();
        FilmPoster[] expected = new FilmPoster[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

}
