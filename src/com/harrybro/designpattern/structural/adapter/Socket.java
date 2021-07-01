package com.harrybro.designpattern.structural.adapter;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }

}
