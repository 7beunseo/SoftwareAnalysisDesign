package study.ch17;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // observer 저장
    public List<Observer> observers = new ArrayList<>();

    // observer 추가
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // observer에게 통지한다
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
