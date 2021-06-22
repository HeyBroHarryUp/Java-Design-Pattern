package com.harrybro.designpattern.abstractfactory.computer.factory;

import com.harrybro.designpattern.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.abstractfactory.computer.keyboard.SamsungKeyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.Mouse;
import com.harrybro.designpattern.abstractfactory.computer.mouse.SamsungMouse;

public class SamsungComputerFactory implements ComputerFactory {

    @Override
    public Keyboard getKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new SamsungMouse();
    }

}
