package com.harrybro.designpattern.abstractfactory.computer.factory;

import com.harrybro.designpattern.abstractfactory.computer.keyboard.AppleKeyboard;
import com.harrybro.designpattern.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.AppleMouse;
import com.harrybro.designpattern.abstractfactory.computer.mouse.Mouse;

public class AppleComputerFactory implements ComputerFactory {

    @Override
    public Keyboard getKeyboard() {
        return new AppleKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new AppleMouse();
    }

}
