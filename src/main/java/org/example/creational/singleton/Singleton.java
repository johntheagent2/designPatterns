package org.example.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public final class Singleton {
    private static Singleton instance;
    private List<String> myList;

    private Singleton() {
        myList = new ArrayList<>();
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public synchronized void addToMyList(String item) {
        for(int i = 0; i < 200; i++){
            myList.add(item + ": " + i);
        }
    }

    public synchronized List<String> getMyList() {
        return new ArrayList<>(myList); // Return a copy to avoid external modification
    }
}
