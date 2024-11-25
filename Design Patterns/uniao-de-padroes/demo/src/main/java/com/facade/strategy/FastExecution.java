package com.facade.strategy;

public class FastExecution implements TaskExecutionStrategy {
    @Override
    public void execute(String taskName) {
        System.out.println("Executing " + taskName + " quickly!");
    }
}
