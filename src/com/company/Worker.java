package com.company;

public class Worker {
    String name;
}
class Employee extends Worker{
    int years_in;

    public Employee(String name, int years_in) {
        this.name = name;
        this.years_in = years_in;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", years_in=" + years_in +
                '}';
    }
}
class Contractor extends Worker{
    int contract_length;

    public Contractor(String name, int contract_length) {
        this.name = name;
        this.contract_length = contract_length;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                ", contract_length=" + contract_length +
                '}';
    }
}
