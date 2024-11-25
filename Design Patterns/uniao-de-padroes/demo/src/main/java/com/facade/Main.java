package com.facade;

import com.facade.composite.CompositeTask;
import com.facade.composite.TaskComponent;
import com.facade.strategy.DetailedExecution;
import com.facade.strategy.FastExecution;

public class Main {
    public static void main(String[] args) {
        TaskFacade facade = new TaskFacade();

        facade.addObserver(message -> System.out.println("Observer received: " + message));

        TaskComponent task1 = facade.createSimpleTask("Task 1", new FastExecution());
        TaskComponent task2 = facade.createSimpleTask("Task 2", new DetailedExecution());

        CompositeTask project = facade.createCompositeTask("Project A");
        project.addSubtask(task1);
        project.addSubtask(task2);
        facade.executeTask(project);
    }
}