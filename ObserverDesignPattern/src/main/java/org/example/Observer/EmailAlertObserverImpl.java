package org.example.Observer;

import org.example.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotifyAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(emailId, "Product is in Stock !");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("Mail sent to: "+ emailId);
    }
}
