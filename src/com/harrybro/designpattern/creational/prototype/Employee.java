package com.harrybro.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * DB 대용 클래스
 */
public class Employee implements Cloneable {

    private List<String> employees;

    public Employee() {
        this.employees = new ArrayList<>();
    }

    public Employee(List<String> employees) {
        this.employees = employees;
    }

    public void loadData() {
        this.employees.addAll(List.of("Harry", "Bro", "Jack", "Mari"));
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Employee(new ArrayList<>(this.employees));
    }
}
