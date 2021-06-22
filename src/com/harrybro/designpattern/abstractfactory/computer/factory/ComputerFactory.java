package com.harrybro.designpattern.abstractfactory.computer.factory;

import com.harrybro.designpattern.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.Mouse;

public interface ComputerFactory {

    Keyboard getKeyboard();

    Mouse getMouse();

}
