package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertsObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneOverservableImp implements StocksOvservable{
    public List<NotificationAlertsObserver> observerList=new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertsObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertsObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertsObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+=newStockAdded;
    }
}
