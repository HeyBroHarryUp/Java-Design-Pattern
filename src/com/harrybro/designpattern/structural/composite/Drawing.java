package com.harrybro.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private final List<Shape> shapes;

    public Drawing() {
        this.shapes = new ArrayList<>();
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }

    public void clear() {
        this.shapes.clear();
    }

}
