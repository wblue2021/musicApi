package com.codedifferently.musicartistwidget.domain.musicartist.models;

public class Content {
    private String rank;
    private String artist;
    private String lastWeek;
    private String peakPosition;
    private String weeksOnChart;
    private String detail;

    public Content() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(String lastWeek) {
        this.lastWeek = lastWeek;
    }

    public String getPeakPosition() {
        return peakPosition;
    }

    public void setPeakPosition(String peakPosition) {
        this.peakPosition = peakPosition;
    }

    public String getWeeksOnChart() {
        return weeksOnChart;
    }

    public void setWeeksOnChart(String weeksOnChart) {
        this.weeksOnChart = weeksOnChart;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Content{" +
                "rank='" + rank + '\'' +
                ", artist='" + artist + '\'' +
                ", lastWeek='" + lastWeek + '\'' +
                ", peakPosition='" + peakPosition + '\'' +
                ", weeksOnChart='" + weeksOnChart + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
