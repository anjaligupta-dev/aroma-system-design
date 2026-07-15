package class_16.observerDP.onlineClass;

import java.util.ArrayList;
import java.util.List;

public class ClassScheduler implements Subject {
    private final List<Observer> observerList = new ArrayList<>();
    private String classTitle;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
        System.out.println(observer + " subscribed.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
        System.out.println(observer + " unsubscribed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(classTitle);
        }
    }

    public void scheduleClass(String classTitle) {
        this.classTitle = classTitle;
        notifyObservers();
    }
}
