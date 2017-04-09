package org.fmamic.design.patterns.observer.weather;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
