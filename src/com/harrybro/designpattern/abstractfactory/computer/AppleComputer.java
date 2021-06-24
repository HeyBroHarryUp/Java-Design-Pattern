package com.harrybro.designpattern.abstractfactory.computer;

import com.harrybro.designpattern.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.Mouse;

public class AppleComputer extends Computer {

    private static final String type = "Apple";

    public AppleComputer(Keyboard keyboard, Mouse mouse) {
        super(type, keyboard, mouse);
    }

}
