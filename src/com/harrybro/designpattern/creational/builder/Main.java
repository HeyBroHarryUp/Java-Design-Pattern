package com.harrybro.designpattern.creational.builder;

public class Main {

    public static void main(String[] args) {
        Car myCar1 = Car.builder().id(1L).name("my car1").build();
        System.out.println(myCar1.getId());
        System.out.println(myCar1.getName());
    }

}
