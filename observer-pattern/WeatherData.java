package com.company;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList = new LinkedList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private float temperature = 0;
    private float humidity = 0;
    private float pressure = 0;

    void measurementsChanged() {
        notifyObservers();
    }
}
