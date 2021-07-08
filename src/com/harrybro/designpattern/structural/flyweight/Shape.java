package com.harrybro.designpattern.structural.flyweight;

import java.awt.*;

public interface Shape {

    void draw(Graphics g, int x, int y, int with, int height, Color color);

}
