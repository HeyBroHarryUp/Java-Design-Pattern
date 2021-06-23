package com.harrybro.designpattern.abstractfactory.computer;

import com.harrybro.designpattern.abstractfactory.computer.factory.AppleComputerFactory;
import com.harrybro.designpattern.abstractfactory.computer.factory.ComputerFactory;
import com.harrybro.designpattern.abstractfactory.computer.factory.SamsungComputerFactory;

public enum BrandType {

    APPLE(new AppleComputerFactory()), SAMSUNG(new SamsungComputerFactory());

    private ComputerFactory computerFactory;

    BrandType(ComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
    }

    public ComputerFactory getComputerFactory() {
        return computerFactory;
    }

}
