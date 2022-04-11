package com.codedifferently.musicartistwidget.domain.musicartist.controller;

import com.codedifferently.musicartistwidget.domain.musicartist.models.Content;
import com.codedifferently.musicartistwidget.domain.musicartist.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("content")
@CrossOrigin("http://localhost:3000")
public class ContentController {
    private ArtistService artistService;

    @Autowired
    public ContentController(ArtistService artistService) {
        this.artistService = artistService;
    }
    @GetMapping("")
    public ResponseEntity<List<Content>> requestTopTen(){
        Optional<List<Content>> optionalContentList = artistService.requestDataFromApi();
        List<Content> contentList = optionalContentList.get();
        return new ResponseEntity<>(contentList, HttpStatus.OK);

    }
}
