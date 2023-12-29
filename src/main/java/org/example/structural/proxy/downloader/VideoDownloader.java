package org.example.structural.proxy.downloader;

import org.example.structural.proxy.library.ThirdPartyLibraryInterface;
import org.example.structural.proxy.library.ThirdPartyLibraryService;
import org.example.structural.proxy.library.Video;

import java.util.HashMap;

public class VideoDownloader {
    private ThirdPartyLibraryInterface api;

    public VideoDownloader(ThirdPartyLibraryInterface api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page");
        System.out.println("ID: " + video.getVideoId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.getVideoId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}
