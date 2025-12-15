package Vidya;

import java.util.Arrays;

public abstract class Character {
    protected int level;
    double experience;
    protected String classAttribute;
    protected String zone;
    String name;
    private String[] party;
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

    public String getClassAttribute() {
        return classAttribute;
    }

    public void setClassAttribute(String classAttribute) {
        this.classAttribute = classAttribute;
    }

    public int getLevel() {
        return level;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String[] getParty() {
        return party;
    }

    public void setParty(String[] party){
        this.party= party;

    }

    public String getName() {
        return name;
    }

    public abstract void squadUp(String target);
}
