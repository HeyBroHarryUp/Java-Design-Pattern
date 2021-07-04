package com.harrybro.designpattern.structural.decorator.decoration;

import com.harrybro.designpattern.structural.decorator.ChristmasTree;

public class Lights extends TreeDecorator {

    public Lights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with Lights";
    }

}
