package com.harrybro.designpattern.creational.abstractfactory.computer.factory;

import com.harrybro.designpattern.creational.abstractfactory.computer.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerBrandType brand) {
        return brand.getFactory().getComputer();
    }

}
