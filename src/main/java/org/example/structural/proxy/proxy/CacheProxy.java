package org.example.structural.proxy.proxy;

import org.example.structural.proxy.library.ThirdPartyVideoLibrary;
import org.example.structural.proxy.library.ThirdPartyVideoService;
import org.example.structural.proxy.library.Video;

import java.util.HashMap;

public class CacheProxy implements ThirdPartyVideoLibrary {
    private ThirdPartyVideoService youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public CacheProxy(){
        this.youtubeService = new ThirdPartyVideoService();
    }


    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoID) {
        Video video = cacheAll.get(videoID);
        if (video == null) {
            video = youtubeService.getVideo(videoID);
            cacheAll.put(videoID, video);
        } else {
            System.out.println("Retrieved video '" + videoID + "' from cache.");
        }
        return video;
    }

    public void resetCachePopular() {
        cachePopular.clear();
    }

    public void resetAllCache(){
        cacheAll.clear();
        cachePopular.clear();
    }
}
