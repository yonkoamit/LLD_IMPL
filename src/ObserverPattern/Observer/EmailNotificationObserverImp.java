package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksOvservable;

public class EmailNotificationObserverImp implements NotificationAlertsObserver{
    String emailId;
    StocksOvservable observable;

    public EmailNotificationObserverImp(String emailId,StocksOvservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update() {
        notifyOnEmail();
    }

    public void notifyOnEmail(){
        System.out.println("mail sent to" + emailId);
    }
}
