package com.harrybro.designpattern.abstractfactory.computer.factory;

import com.harrybro.designpattern.abstractfactory.computer.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerBrandType brand) {
        return brand.getFactory().getComputer();
    }

}
