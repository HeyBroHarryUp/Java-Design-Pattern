package com.harrybro.designpattern.abstractfactory.computer;

import com.harrybro.designpattern.abstractfactory.computer.factory.AppleComputerFactory;
import com.harrybro.designpattern.abstractfactory.computer.factory.ComputerFactory;
import com.harrybro.designpattern.abstractfactory.computer.factory.SamsungComputerFactory;

public class Computer {

    public void getComputer(BrandType brand) {
        ComputerFactory computerFactory;
        switch (brand) {
            case APPLE: computerFactory = new AppleComputerFactory(); break;
            case SAMSUNG: computerFactory = new SamsungComputerFactory(); break;
            default: throw new IllegalArgumentException("Not found brand");
        }
        computerFactory.getKeyboard();
        computerFactory.getMouse();
    }

    public void getComputerUseEnum(BrandType brand) {
        brand.getComputerFactory().getKeyboard();
        brand.getComputerFactory().getMouse();
    }

}
