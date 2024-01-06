package org.example.behavioral.observer;

import org.example.behavioral.observer.listeners.EmailNotification;
import org.example.behavioral.observer.listeners.MobileNotification;
import org.example.behavioral.observer.productNotifier.Notifier;

public class Main {
    public static void main(String[] args){
        Notifier notifier = new Notifier();
        Runnable printListOfFoods = Notifier::printListOfFoods;

        notifier.getEvent().subscribe("added", new EmailNotification("caophat113@gmail.com"));
        notifier.add("A5 Beef");
        notifier.add("Salmon");

        notifier.getEvent().unsubscribe("added", new EmailNotification("caophat113@gmail.com"));
        notifier.add("Clean Eggs");

        printListOfFoods.run();

    }
}
