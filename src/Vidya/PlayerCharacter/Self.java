package Vidya.PlayerCharacter;
import Vidya.Character;
import Vidya.Functionality;

public class Self extends Character implements Functionality {

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

    @Override
    public void squadUp(String target) {
        System.out.println("Already in a Group");
    }
    @Override
    public void teleport(String teleporter,String location) {
        System.out.println("Character is now teleporting to " + location);
    }
}
