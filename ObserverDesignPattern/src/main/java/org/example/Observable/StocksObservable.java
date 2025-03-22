package org.example.Observable;

import org.example.Observer.NotifyAlertObserver;

public interface StocksObservable {

    public void add(NotifyAlertObserver notifyAlertObserver);
    public void remove(NotifyAlertObserver notifyAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
