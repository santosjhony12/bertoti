package com.facade.observer;

import java.util.ArrayList;
import java.util.List;

public class TaskNotifier {
    private final List<TaskObserver> observers = new ArrayList<>();

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}