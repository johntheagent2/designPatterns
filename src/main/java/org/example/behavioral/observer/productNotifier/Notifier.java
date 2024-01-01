package org.example.behavioral.observer.productNotifier;

import org.example.behavioral.observer.publisher.Publishers;

import java.util.HashSet;
import java.util.Set;

public class Notifier {
    public Publishers events;
    private static final Set<String> foodList = new HashSet<>();

    public Notifier() {
        this.events = new Publishers(new String[]{"added", "removed"});
    }

    public Publishers getEvent(){
        return this.events;
    }

    public void add(String foodName) {
        foodList.add(foodName);
        events.notify("added", foodName);
    }

    public void remove(String foodName){
        foodList.remove(foodName);
        events.notify("removed", foodName);
    }
}
