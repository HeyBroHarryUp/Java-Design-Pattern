package com.harrybro.designpattern.structural.bridge.character;

import com.harrybro.designpattern.structural.bridge.attack.Attack;

public class Wizard extends CharacterJob {

    public Wizard(Attack attack) {
        super(attack);
    }

    @Override
    public void attack() {
        attack.attack();
    }

}
