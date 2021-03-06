package com.harrybro.designpattern.structural.adapter.objectadapter;

import com.harrybro.designpattern.structural.adapter.Socket;
import com.harrybro.designpattern.structural.adapter.Volt;
import com.harrybro.designpattern.structural.adapter.SocketAdapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket;

    public SocketObjectAdapterImpl() {
        this.socket = new Socket();
    }

    @Override
    public Volt get120Volt() {
        return this.socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(120);
    }

    @Override
    public Volt get3Volt() {
        return new Volt(3);
    }

}
