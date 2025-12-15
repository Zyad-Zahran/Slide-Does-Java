package Vidya.PlayerCharacter;
import Vidya.Character;
import Vidya.Functionality;

import java.util.Arrays;

public class Allies extends Character implements Functionality {

    public Allies(int level, double experience, String classAttribute, String zone) {
        super(new String[]{"Mage","Tank","DPS","Healer","Hero"},"Package",level, experience, classAttribute, zone);
    }

    @Override
    public void getDescription() {
        System.out.println("A whole squad just dropped in");
        System.out.println("They are a group of a " + Arrays.toString(getParty()));
        System.out.println("==============================");
    }
    @Override
    public void squadUp(String target) {
        System.out.println("Joined Party with "+ target);
    }

    @Override
    public void teleport(String teleporter,String location) {
        System.out.println("A "+teleporter+" Is currently teleporting to "+location);
    }
}
