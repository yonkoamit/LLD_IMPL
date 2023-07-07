package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksOvservable;

public class MobileAlertsObserverImp implements NotificationAlertsObserver{
    String mobileNu;
    StocksOvservable observer;

    public MobileAlertsObserverImp(String mobileNu, StocksOvservable observer){
        this.mobileNu=mobileNu;
        this.observer=observer;
    }

    @Override
    public void update() {
        notifyOnMobile();
    }

    public void notifyOnMobile(){
        System.out.println("Notification sent to" + mobileNu);
    }
}
