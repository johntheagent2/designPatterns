package org.example.behavioral.observer.listeners;

public class MobileNotification implements EventListener{
    private final String mobile;

    public MobileNotification(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public void update(String eventType, String foodType) {
        runTime();
        System.out.println(foodType + " has been " + eventType + " to our store! Come and check " + mobile);
    }

    private void runTime(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
