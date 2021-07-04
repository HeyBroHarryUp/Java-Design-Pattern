package com.harrybro.designpattern.structural.decorator.decoration;

import com.harrybro.designpattern.structural.decorator.ChristmasTree;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with Tinsel";
    }

}
