package com.codedifferently.musicartistwidget.domain.musicartist.service;

import com.codedifferently.musicartistwidget.domain.musicartist.models.Content;
import com.codedifferently.musicartistwidget.domain.musicartist.models.ContentApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ArtistServiceImpl implements ArtistService {
    private RestTemplate template;

    public ArtistServiceImpl(){
        template = new RestTemplate();
    }

    @Value("${content.api.key}")
    private String apiKey;

    @PostConstruct
    public void setup(){
        requestDataFromApi();
    }

    @Override
    public Optional<List<Content>> requestDataFromApi() {
        try {
            String url = "https://billboard-api2.p.rapidapi.com/artist-100?range=1-10&date=2019-05-11";
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Host", "billboard-api2.p.rapidapi.com");
            headers.set("X-RapidAPI-Key", apiKey);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<ContentApiResponse> response = template.exchange(url, HttpMethod.GET, entity, ContentApiResponse.class);
            ContentApiResponse contentApiResponse = response.getBody();
            log.info(contentApiResponse.toString());
            return Optional.empty();
        } catch (HttpClientErrorException ex) {
            log.error(ex.getMessage());
            return Optional.empty();
        }
    }
}

