package org.example.structural.proxy.library;

import java.util.HashMap;

public interface ThirdPartyLibraryInterface {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
