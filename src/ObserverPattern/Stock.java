package ObserverPattern;

import ObserverPattern.Observable.IphoneOverservableImp;
import ObserverPattern.Observable.StocksOvservable;
import ObserverPattern.Observer.EmailNotificationObserverImp;
import ObserverPattern.Observer.MobileAlertsObserverImp;
import ObserverPattern.Observer.NotificationAlertsObserver;

public class Stock {
    public static void main(String args[]){
        StocksOvservable IphoneStockObservable=new IphoneOverservableImp();

        NotificationAlertsObserver observer1= new EmailNotificationObserverImp("abc@gmail.com",IphoneStockObservable);
        NotificationAlertsObserver observer2=new EmailNotificationObserverImp("hc@gmail.com",IphoneStockObservable);
        NotificationAlertsObserver observer3=new MobileAlertsObserverImp("619",IphoneStockObservable);

        IphoneStockObservable.add(observer1);
        IphoneStockObservable.add(observer2);
        IphoneStockObservable.add(observer3);

        IphoneStockObservable.setStockCount(10);
    }
}
