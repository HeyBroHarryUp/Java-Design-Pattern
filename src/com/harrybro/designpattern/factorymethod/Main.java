package com.harrybro.designpattern.factorymethod;

import com.harrybro.designpattern.factorymethod.computer.Computer;
import com.harrybro.designpattern.factorymethod.computer.ComputerFactory;
import com.harrybro.designpattern.factorymethod.computer.ComputerType;

public class Main {

    public static void main(String[] args) {
        Computer desktop1 = ComputerFactory.getComputer(ComputerType.DESKTOP, "i7", "ddr4");
        Computer notebook1 = ComputerFactory.getComputer(ComputerType.NOTEBOOK, "i5", "ddr3");
        System.out.println(desktop1.getType());
        System.out.println(notebook1.getType());
    }

}
