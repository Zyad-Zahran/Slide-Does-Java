package Vidya.PlayerCharacter;
import Vidya.Character;

public class Allies extends Character {

    public Allies(int level, double experience, String classAttribute, String zone) {
        super(new String[]{"Mage","Tank","DPS","Healer","Hero"},"Package",level, experience, classAttribute, zone);
    }
}
