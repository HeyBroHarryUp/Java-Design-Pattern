package com.harrybro.designpattern.structural.bridge.attack;

public class SwordAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Sword Attack");
    }

}
