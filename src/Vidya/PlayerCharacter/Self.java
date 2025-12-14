package Vidya.PlayerCharacter;
import Vidya.Character;

public class Self extends Character {

    public Self(int level, double experience, String classAttribute, String zone) {
        super(new String[]{}, "GOAT", level, experience, classAttribute, zone);
    }

    @Override
    public void getDescription() {
        System.out.println("A level "+level+ " " + classAttribute + " is now in " + zone);
        System.out.println("This is you the greatest of all time");
        System.out.println("Your Party is Package");
        System.out.println("You are the GOAT");

    }
}
