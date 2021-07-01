package com.harrybro.designpattern.structural.bridge.character;

import com.harrybro.designpattern.structural.bridge.attack.Attack;

public abstract class CharacterJob {

    protected Attack attack;

    public CharacterJob(Attack attack) {
        this.attack = attack;
    }

    abstract public void attack();

}
