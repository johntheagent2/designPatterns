package org.example.structural.proxy.library;

public class Video {
    private String id;
    private String name;
    private String data;

    public Video(String id, String name) {
        this.id = id;
        this.name = name;
        this.data = "some video data";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getData(){
        return data;
    }
}
