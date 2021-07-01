package com.harrybro.designpattern.creational.factorymethod.computer;

public enum ComputerType {

    DESKTOP(new Desktop()),
    NOTEBOOK(new Notebook());

    private Computer computer;

    ComputerType(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

}
