package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {
    public static void main (String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> videosCollection = videoCollector.getCollection();

        if (videosCollection.size() > 2) {
            String movie = videosCollection.get(0);
            System.out.println(movie);

            String anotherMovie = videosCollection.get(2);
            System.out.println(anotherMovie);
        }
    }
}
