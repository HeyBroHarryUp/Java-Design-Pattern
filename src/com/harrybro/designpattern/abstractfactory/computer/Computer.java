package com.harrybro.designpattern.abstractfactory.computer;

import com.harrybro.designpattern.abstractfactory.computer.keyboard.Keyboard;
import com.harrybro.designpattern.abstractfactory.computer.mouse.Mouse;

public abstract class Computer {

    private String type;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(String type, Keyboard keyboard, Mouse mouse) {
        this.type = type;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public String getType() {
        return type;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }
    public Mouse getMouse() {
        return this.mouse;
    }

//    public void getComputer(BrandType brand) {
//        ComputerFactory computerFactory;
//        switch (brand) {
//            case APPLE: computerFactory = new AppleComputerFactory(); break;
//            case SAMSUNG: computerFactory = new SamsungComputerFactory(); break;
//            default: throw new IllegalArgumentException("Not found brand");
//        }
//        computerFactory.getKeyboard();
//        computerFactory.getMouse();
//    }
//
//    public void getComputerUseEnum(BrandType brand) {
//        brand.getComputerFactory().getKeyboard();
//        brand.getComputerFactory().getMouse();
//    }

}
