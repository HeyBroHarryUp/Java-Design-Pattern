package com.harrybro.designpattern.structural.bridge.character;

import com.harrybro.designpattern.structural.bridge.attack.Attack;

public class Warrior extends CharacterJob {

    public Warrior(Attack attack) {
        super(attack);
    }

    @Override
    public void attack() {
        attack.attack();
    }

}
