package Vidya.NonPlayerCharacter;
import Vidya.Character;

public class Friendly extends Character {

    public Friendly(int level, double experience, String classAttribute, String zone) {
        super(new String[]{"Solo"},"Gladge NPC",level, experience, classAttribute, zone);
    }

    @Override
    public void squadUp(String Null) {
        System.out.println("Non player characters can not join a party");

    }
}
