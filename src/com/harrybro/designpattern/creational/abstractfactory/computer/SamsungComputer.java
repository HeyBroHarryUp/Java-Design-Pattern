package com.harrybro.designpattern.creational.abstractfactory.computer;

import com.harrybro.designpattern.creational.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.creational.abstractfactory.computer.mouse.Mouse;

public class SamsungComputer extends Computer {

    private static final String type = "Samsung";

    public SamsungComputer(Keyboard keyboard, Mouse mouse) {
        super(type, keyboard, mouse);
    }

}
