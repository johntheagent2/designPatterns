package org.example.structural.proxy.library;

import java.util.HashMap;
public interface ThirdPartyVideoLibrary {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoID);
}
