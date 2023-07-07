package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertsObserver;

public interface StocksOvservable {
    public void add(NotificationAlertsObserver observer);
    public void remove(NotificationAlertsObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
