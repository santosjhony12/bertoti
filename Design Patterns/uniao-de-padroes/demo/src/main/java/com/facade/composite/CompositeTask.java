package com.facade.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements TaskComponent {
    private final String name;
    private final List<TaskComponent> subtasks = new ArrayList<>();

    public CompositeTask(String name) {
        this.name = name;
    }

    public void addSubtask(TaskComponent subtask) {
        subtasks.add(subtask);
    }

    @Override
    public void execute() {
        System.out.println("Executing composite task: " + name);
        subtasks.forEach(TaskComponent::execute);
    }
}