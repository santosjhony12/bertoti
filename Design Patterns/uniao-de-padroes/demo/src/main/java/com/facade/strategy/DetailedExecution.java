package com.facade.strategy;

public class DetailedExecution implements TaskExecutionStrategy {
    @Override
    public void execute(String taskName) {
        System.out.println("Executing " + taskName + " with attention to detail!");
    }
}