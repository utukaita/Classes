package com.company;

import java.util.Arrays;

public class Project {
    Task[] tasks;
    int identifier;
    static int identifier_counter = 0;
    public Project (Task[] tasks) {
        this.tasks = tasks;
        identifier = identifier_counter++;
    }

    @Override
    public String toString() {
        return "Project{" +
                "tasks=" + Arrays.toString(tasks) +
                ", identifier=" + identifier +
                '}';
    }
}

