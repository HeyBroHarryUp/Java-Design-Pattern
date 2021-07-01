package com.harrybro.designpattern.creational.abstractfactory;

import com.harrybro.designpattern.creational.abstractfactory.computer.Computer;
import com.harrybro.designpattern.creational.abstractfactory.computer.factory.ComputerBrandType;
import com.harrybro.designpattern.creational.abstractfactory.computer.factory.ComputerFactory;

public class Main {

    public static void main(String[] args) {
        Computer appleComputer1 = ComputerFactory.getComputer(ComputerBrandType.APPLE);
        Computer samsungComputer1 = ComputerFactory.getComputer(ComputerBrandType.SAMSUNG);
        System.out.println(appleComputer1.getType());
        System.out.println(samsungComputer1.getType());
    }

}
