package org.example.Observer;

import org.example.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotifyAlertObserver{
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.username = username;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendNotification(username, "Product is in Stock !");
    }

    private void sendNotification(String username, String message) {
        System.out.println("Notification sent to: "+ username);
    }
}
