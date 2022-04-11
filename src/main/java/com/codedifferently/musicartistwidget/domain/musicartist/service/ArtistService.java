package com.codedifferently.musicartistwidget.domain.musicartist.service;

import com.codedifferently.musicartistwidget.domain.musicartist.models.Content;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    Optional<List<Content>>requestDataFromApi();
}