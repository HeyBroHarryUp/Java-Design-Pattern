package com.harrybro.designpattern.structural.composite;

public class Test {

    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape triangle1 = new Triangle();

        Drawing drawing = new Drawing();
        drawing.add(circle1);
        drawing.add(circle2);
        drawing.add(triangle1);

        drawing.draw();
    }

}
