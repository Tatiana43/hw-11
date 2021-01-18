package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FilmPoster {
    private int id;
    private String pictureUrl;
    private String filmName;
    private String genre;
    private boolean premiereTomorrow;
}
