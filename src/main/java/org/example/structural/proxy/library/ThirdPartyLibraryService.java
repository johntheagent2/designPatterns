package org.example.structural.proxy.library;

import java.util.HashMap;

public class ThirdPartyLibraryService  implements ThirdPartyLibraryInterface{
    public HashMap<String, Video> popularVideos() {
        connectToServer("youtube.com");
        return getPopularVideos();
    }

    public Video getVideo(String videoId) {
        connectToServer("youtube.com");
        return getSomeVideo(videoId);
    }

    private void networkLatency(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void connectToServer(String server){
        System.out.println("Connecting to " + server + "... ");
        networkLatency();
        System.out.println("Connected!");
    }

    private HashMap<String, Video> getPopularVideos() {
        System.out.print("Downloading popular videos... ");

        networkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("sadgahasgdas", new Video("sadgahasgdas", "cat_dancing.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "dog_fell_into_pool_of_balls.mp4"));
        hmap.put("asdfas3ffasd", new Video("asdfas3ffasd", "dancing_video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "football.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "programming_tutorial.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        networkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }


}
