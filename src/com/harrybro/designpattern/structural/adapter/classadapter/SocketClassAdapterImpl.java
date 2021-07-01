package com.harrybro.designpattern.structural.adapter.classadapter;

import com.harrybro.designpattern.structural.adapter.Socket;
import com.harrybro.designpattern.structural.adapter.SocketAdapter;
import com.harrybro.designpattern.structural.adapter.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return super.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(12);
    }

    @Override
    public Volt get3Volt() {
        return new Volt(3);
    }

}
