package Vidya;

import java.util.Arrays;

public class Character {
    protected int level;
    double experience;
    protected String classAttribute;
    protected String zone;
    String name;
    private final String[] party;
    public Character(String[] party,String name, int level, double experience, String classAttribute, String zone) {
        this.level = level;
        this.experience = experience;
        this.classAttribute = classAttribute;
        this.zone = zone;
        this.name = name;
        this.party=party;
    }
    public void getDescription(){
        int length = party.length;
        System.out.println("A level "+level+ " " + classAttribute + " is now in " + zone);
        System.out.println("They are " + (length > 1 ? ("A Group of" + Arrays.toString(party)):"Alone"));
        System.out.println("They are called (" + name + ") and Their total current EXP is " + experience);
        System.out.println("=====================");
    }

}
