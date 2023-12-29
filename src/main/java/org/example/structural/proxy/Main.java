package org.example.structural.proxy;

import org.example.structural.proxy.downloader.VideoDownloader;
import org.example.structural.proxy.library.ThirdPartyLibraryService;
import org.example.structural.proxy.proxy.CacheProxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader naiveDownloader = new VideoDownloader(new ThirdPartyLibraryService());
        VideoDownloader smartDownloader = new VideoDownloader(new CacheProxy());

        long noProxy = test(naiveDownloader);
        long proxy = test(smartDownloader);
        System.out.print("Time elapsed no proxy: " + noProxy + "ms\n");
        System.out.print("Time elapsed proxy: " + proxy + "ms\n");
        System.out.print("Time saved by caching proxy: " + (noProxy - proxy) + "ms");

    }

    private static long test(VideoDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("sadgahasgdas");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("mkafksangasj");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("sadgahasgdas");
        downloader.renderVideoPage("3sdfgsd1j333");
        System.out.println("=====DONE!!=====");

        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}
