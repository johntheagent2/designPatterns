package org.example.behavioral.observer;

import org.example.behavioral.observer.listeners.EmailNotification;
import org.example.behavioral.observer.listeners.MobileNotification;
import org.example.behavioral.observer.productNotifier.Notifier;

public class Main {
    public static void main(String[] args){
        Notifier notifier = new Notifier();
        notifier.getEvent().subscribe("added", new EmailNotification("caophat113@gmail.com"));
        notifier.getEvent().subscribe("added", new EmailNotification("caophat440@gmail.com"));
        notifier.getEvent().subscribe("added", new MobileNotification("0707854816"));

        notifier.getEvent().subscribe("removed", new MobileNotification("0707854816"));

        notifier.add("A5 Beef");
        notifier.add("Clean Eggs");
        notifier.remove("A5 Beef");

    }
}
