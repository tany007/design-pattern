package org.example.Observable;

import org.example.Observer.NotifyAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    public final List<NotifyAlertObserver> notifyAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotifyAlertObserver notifyAlertObserver) {
        notifyAlertObserverList.add(notifyAlertObserver);
    }

    @Override
    public void remove(NotifyAlertObserver notifyAlertObserver) {
        notifyAlertObserverList.remove(notifyAlertObserver);

    }

    @Override
    public void notifySubscribers() {
        for (NotifyAlertObserver observer : notifyAlertObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0)
            notifySubscribers();
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
