package com.harrybro.designpattern.structural.flyweight;

import java.awt.*;

public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean fill) {
        System.out.println("Creating Oval object");
        this.fill = fill;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int with, int height, Color color) {
        g.setColor(color);
        g.drawLine(x, y, with, height);
        if (this.fill) g.fillOval(x, y, with, height);
    }

}
