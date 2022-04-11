package com.codedifferently.musicartistwidget.domain.musicartist.models;

import java.util.List;
import java.util.Map;

public class ContentApiResponse {
    private Map<String, Content> content;

    public ContentApiResponse() {
    }

    public Map<String, Content> getContent() {
        return content;
    }

    public void setContent(Map<String, Content> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ContentApiResponse{" +
                "content=" + content +
                '}';
    }
}
