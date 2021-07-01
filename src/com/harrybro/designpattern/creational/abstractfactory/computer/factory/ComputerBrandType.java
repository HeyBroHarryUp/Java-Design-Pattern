package com.harrybro.designpattern.creational.abstractfactory.computer.factory;

public enum ComputerBrandType {

    APPLE(new AppleComputerFactory()), SAMSUNG(new SamsungComputerFactory());

    private final ComputerAbstractFactory factory;

    ComputerBrandType(ComputerAbstractFactory factory) {
        this.factory = factory;
    }

    public ComputerAbstractFactory getFactory() {
        return factory;
    }

}
