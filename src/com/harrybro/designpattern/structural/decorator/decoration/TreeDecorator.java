package com.harrybro.designpattern.structural.decorator.decoration;

import com.harrybro.designpattern.structural.decorator.ChristmasTree;

public abstract class TreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return this.christmasTree.decorate();
    }

}
