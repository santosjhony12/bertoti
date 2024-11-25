package com.facade.composite;

import com.facade.strategy.TaskExecutionStrategy;

public class Task implements TaskComponent {
    private final String name;
    private final TaskExecutionStrategy strategy;

    public Task(String name, TaskExecutionStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    @Override
    public void execute() {
        strategy.execute(name);
    }
}