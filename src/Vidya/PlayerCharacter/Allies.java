package Vidya.PlayerCharacter;
import Vidya.Character;

import java.util.Arrays;

public class Allies extends Character {

    public Allies(int level, double experience, String classAttribute, String zone) {
        super(new String[]{"Mage","Tank","DPS","Healer","Hero"},"Package",level, experience, classAttribute, zone);
    }

    @Override
    public void getDescription() {
        System.out.println("A whole squad just dropped in");
        System.out.println("They are a group of a " + Arrays.toString(getParty()));
        System.out.println("==============================");
    }
}
