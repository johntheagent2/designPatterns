package org.example.structural.proxy.library;

public class Video {
    private String videoId;
    private String title;
    private final String data;

    public Video(String videoId, String title) {
        this.videoId = videoId;
        this.title = title;
        this.data = "Random video data";
    }

    public String getVideoId() {
        return videoId;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }
}
