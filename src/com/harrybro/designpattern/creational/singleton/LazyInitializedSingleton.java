package com.harrybro.designpattern.creational.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        return instance == null ? instance = new LazyInitializedSingleton() : instance;
    }

}
