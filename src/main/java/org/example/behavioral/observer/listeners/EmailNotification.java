package org.example.behavioral.observer.listeners;

public class EmailNotification implements EventListener{
    private final String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String foodType) {
        runTime();
        System.out.println(foodType + " has been " + eventType + " to our store! Come and check " + email);
    }

    private void runTime(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
