package org.example.structural.proxy;

import org.example.structural.proxy.downloader.VideoDownloader;
import org.example.structural.proxy.library.ThirdPartyVideoService;
import org.example.structural.proxy.proxy.CacheProxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader naiveDownloader = new VideoDownloader(new ThirdPartyVideoService());
        VideoDownloader smartDownloader = new VideoDownloader(new CacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time elapsed not using proxy: " + naive + "ms\n");
        System.out.println("Time elapsed using proxys: " + smart + "ms\n");
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(VideoDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("ab123as");
        downloader.renderPopularVideos();
        // Users might visit the same page quite often.
        downloader.renderVideoPage("asd52xx");
        downloader.renderVideoPage("ab123as");

        return System.currentTimeMillis() - startTime;
    }
}
