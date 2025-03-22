package org.example;

import org.example.Observable.IphoneObservableImpl;
import org.example.Observable.StocksObservable;
import org.example.Observer.EmailAlertObserverImpl;
import org.example.Observer.MobileAlertObserverImpl;
import org.example.Observer.NotifyAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotifyAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotifyAlertObserver observer2 = new MobileAlertObserverImpl("xyz", iphoneStockObservable);
        NotifyAlertObserver observer3 = new MobileAlertObserverImpl("abed", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
        //iphoneStockObservable.setStockCount(100);



    }
}