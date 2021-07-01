package com.harrybro.designpattern.structural.bridge.attack;

public class MagicAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Magic Attack");
    }

}
