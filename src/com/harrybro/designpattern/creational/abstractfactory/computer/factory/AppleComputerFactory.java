package com.harrybro.designpattern.creational.abstractfactory.computer.factory;

import com.harrybro.designpattern.creational.abstractfactory.computer.AppleComputer;
import com.harrybro.designpattern.creational.abstractfactory.computer.Computer;
import com.harrybro.designpattern.creational.abstractfactory.computer.keyboard.AppleKeyboard;
import com.harrybro.designpattern.creational.abstractfactory.computer.mouse.AppleMouse;

public class AppleComputerFactory implements ComputerAbstractFactory {

    @Override
    public Computer getComputer() {
        return new AppleComputer(new AppleKeyboard(), new AppleMouse());
    }

}
