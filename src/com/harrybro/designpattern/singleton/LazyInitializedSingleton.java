package com.harrybro.designpattern.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        return instance == null ? new LazyInitializedSingleton() : instance;
    }

}
