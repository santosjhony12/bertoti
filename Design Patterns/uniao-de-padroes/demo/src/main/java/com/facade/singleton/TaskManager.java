package com.facade.singleton;

import com.facade.observer.TaskNotifier;

public class TaskManager {
    private static TaskManager instance;
    private final TaskNotifier notifier;

    private TaskManager() {
        notifier = new TaskNotifier();
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public TaskNotifier getNotifier() {
        return notifier;
    }
}
