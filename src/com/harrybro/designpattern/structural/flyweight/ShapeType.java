package com.harrybro.designpattern.structural.flyweight;

public enum ShapeType {

    OVAL_FILL,
    OVAL_NO_FILL,
    LINE;

    public Shape getShape() {
        Shape shape = null;
        if (this.equals(ShapeType.OVAL_FILL)) {
            shape = new Oval(true);
        } else if (this.equals(ShapeType.OVAL_NO_FILL)) {
            shape = new Oval(false);
        } else if (this.equals(ShapeType.LINE)) {
            shape = new Line();
        }
        return shape;
    }

}
