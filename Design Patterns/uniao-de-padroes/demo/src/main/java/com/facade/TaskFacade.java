package com.facade;

import com.facade.composite.CompositeTask;
import com.facade.composite.Task;
import com.facade.composite.TaskComponent;
import com.facade.observer.TaskObserver;
import com.facade.singleton.TaskManager;
import com.facade.strategy.TaskExecutionStrategy;

public class TaskFacade {
    private final TaskManager manager = TaskManager.getInstance();

    public void addObserver(TaskObserver observer) {
        manager.getNotifier().addObserver(observer);
    }

    public TaskComponent createSimpleTask(String name, TaskExecutionStrategy strategy) {
        return new Task(name, strategy);
    }

    public CompositeTask createCompositeTask(String name) {
        return new CompositeTask(name);
    }

    public void executeTask(TaskComponent task) {
        task.execute();
        manager.getNotifier().notifyObservers("Task executed: " + task);
    }
}