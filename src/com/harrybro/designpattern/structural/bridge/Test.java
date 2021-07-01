package com.harrybro.designpattern.structural.bridge;

import com.harrybro.designpattern.structural.bridge.attack.MagicAttack;
import com.harrybro.designpattern.structural.bridge.attack.SwordAttack;
import com.harrybro.designpattern.structural.bridge.character.CharacterJob;
import com.harrybro.designpattern.structural.bridge.character.Warrior;
import com.harrybro.designpattern.structural.bridge.character.Wizard;

public class Test {

    public static void main(String[] args) {
        CharacterJob warrior1 = new Warrior(new SwordAttack());
        CharacterJob wizard1 = new Wizard(new MagicAttack());
        warrior1.attack();
        wizard1.attack();
    }

}
