package com.harrybro.designpattern.creational.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();
        List<String> originEmployees = employee.getEmployees();

        Employee clone1 = (Employee) employee.clone();
        List<String> copyEmployees1 = clone1.getEmployees();
        copyEmployees1.remove(0);

        Employee clone2 = (Employee) employee.clone();
        List<String> copyEmployees2 = clone2.getEmployees();
        copyEmployees2.add("Happy");

        System.out.println("origin: " + originEmployees);
        System.out.println("copy: " + copyEmployees1);
        System.out.println("copy: " + copyEmployees2);
    }

}
