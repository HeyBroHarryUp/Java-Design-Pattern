package com.harrybro.designpattern.abstractfactory.computer.factory;

import com.harrybro.designpattern.abstractfactory.computer.Computer;
import com.harrybro.designpattern.abstractfactory.computer.SamsungComputer;
import com.harrybro.designpattern.abstractfactory.computer.keyboard.SamsungKeyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.SamsungMouse;

public class SamsungComputerFactory implements ComputerAbstractFactory {

    @Override
    public Computer getComputer() {
        return new SamsungComputer(new SamsungKeyboard(), new SamsungMouse());
    }

}
