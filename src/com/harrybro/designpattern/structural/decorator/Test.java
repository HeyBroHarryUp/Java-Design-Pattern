package com.harrybro.designpattern.structural.decorator;

import com.harrybro.designpattern.structural.decorator.decoration.Lights;
import com.harrybro.designpattern.structural.decorator.decoration.Tinsel;

public class Test {

    public static void main(String[] args) {
        ChristmasTree defaultChristmasTree = new ChristmasTreeImpl();
        System.out.println(defaultChristmasTree.decorate());

        ChristmasTree addLightsTree = new Lights(new ChristmasTreeImpl());
        System.out.println(addLightsTree.decorate());

        ChristmasTree addTwoLightsTree = new Lights(addLightsTree);
        System.out.println(addTwoLightsTree.decorate());

        ChristmasTree addTwoLightsAndTinselTree = new Tinsel(addTwoLightsTree);
        System.out.println(addTwoLightsAndTinselTree.decorate());
    }

}
