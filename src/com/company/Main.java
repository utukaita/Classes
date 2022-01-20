package com.company;

public class Main {

    public static void main(String[] args) {
	Employee utu = new Employee("Utu", 69);
	Contractor matti = new Contractor("Matti", 2);
	Employee marika = new Employee("Marika", 200);
	Contractor alisa = new Contractor("Alisa", 3);
	Contractor hitman = new Contractor("Hitman", 13);
	Task cleansing = new Task("Cleansing", new Worker[]{utu, matti});
	Task filing = new Task("Filing", new Worker[]{marika, alisa});
	Task killing = new Task("Killing", new Worker[]{hitman});
	Project x = new Project(new Task[]{cleansing, filing});
	Project y = new Project(new Task[]{killing});
	System.out.println(x);
	System.out.println(y);
    }
}
