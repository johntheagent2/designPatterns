package org.example.behavioral.observer.publisher;

import org.example.behavioral.observer.listeners.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publishers {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public Publishers(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);

        users.removeIf(user -> user.equals(listener));
    }

    public void notify(String eventType, String foodType) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, foodType);
        }
    }
}
