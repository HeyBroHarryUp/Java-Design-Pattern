package com.harrybro.designpattern.abstractfactory;

import com.harrybro.designpattern.abstractfactory.computer.BrandType;
import com.harrybro.designpattern.abstractfactory.computer.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.getComputer(BrandType.APPLE);
    }

}
