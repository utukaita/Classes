package com.company;

import java.util.Arrays;

public class Task {
    String name;
    Worker[] workers;

    public Task(String name, Worker[] workers) {
        this.name = name;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
