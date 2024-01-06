package org.example.creational.singleton;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Runnable task = () -> {
            Singleton singletonManager = Singleton.getInstance();
            singletonManager.addToMyList(Thread.currentThread().getName());
        };

        // Simulating multiple threads
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }

        try {
            Thread.sleep(1000); // Allow threads to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Retrieving and printing the shared list
        Singleton singletonManager = Singleton.getInstance();
        List<String> myList = singletonManager.getMyList();
        System.out.println(myList);
        System.out.println(myList.size());
    }
}
