package com.harrybro.designpattern.abstractfactory.computer;

import com.harrybro.designpattern.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.Mouse;

public class SamsungComputer extends Computer {

    private static final String type = "Samsung";

    public SamsungComputer(Keyboard keyboard, Mouse mouse) {
        super(type, keyboard, mouse);
    }

}
