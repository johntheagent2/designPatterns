package org.example.structural.proxy.proxy;

import org.example.structural.proxy.library.ThirdPartyLibraryInterface;
import org.example.structural.proxy.library.ThirdPartyLibraryService;
import org.example.structural.proxy.library.Video;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Consumer;

public class CacheProxy implements ThirdPartyLibraryInterface {
    private ThirdPartyLibraryService youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public CacheProxy() {
        this.youtubeService = new ThirdPartyLibraryService();
    }

    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()){
            cachePopular = youtubeService.popularVideos();
            cacheAll = cachePopular;
        }else{
            System.out.println("Retrieving popular videos..");
        }
        return cachePopular;
    }

    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);

        if(popularVideos().isEmpty()){
            video = youtubeService.getVideo(videoId);
            cacheAll.put(video.getVideoId(), video);
        }else{
            System.out.println("Retrieving video from cache...");
        }
        return video;
    }

    public void resetAll() {
        cachePopular.clear();
        cacheAll.clear();
    }

    public void resetPopular() {
        cachePopular.clear();
    }
}
