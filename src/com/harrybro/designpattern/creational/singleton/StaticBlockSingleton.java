package com.harrybro.designpattern.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
