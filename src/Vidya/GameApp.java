package Vidya;

import Vidya.PlayerCharacter.Allies;
import Vidya.NonPlayerCharacter.Friendly;
import Vidya.NonPlayerCharacter.Hostile;
import Vidya.PlayerCharacter.Self;


public class GameApp {
    static void main() {
        Hostile madgePeasant = new Hostile(5,1334.256,"Grunt","Dunes");
        Friendly friendlyPeasant = new Friendly(2,100.5,"Priest","Cathedral");
        Allies currentParty = new Allies(19,983.93,"Tank","Dungeon");
        Self playerCharacter = new Self(25,4125.42,"Hero","Dungeon");

        madgePeasant.getDescription();
        friendlyPeasant.getDescription();
        currentParty.getDescription();
        currentParty.setParty(new String[] {"You","I"});
        currentParty.getDescription();
        System.out.println("Your character is a " + playerCharacter.getClassAttribute() );
        System.out.println("It is about to be reborn");
        playerCharacter.setClassAttribute("Assassin");
        System.out.println("Your character is now reborn as a level " + playerCharacter.getLevel()+" "+ playerCharacter.getClassAttribute());
        System.out.println("Casting teleport to Assassin's Home-city..");
        System.out.println("=============================");
        playerCharacter.setZone("Hidden Leaf Village");
        System.out.println("Your final updated character specs: ");
        playerCharacter.getDescription();
        System.out.println("============================");
        madgePeasant.squadUp("");
        friendlyPeasant.squadUp("");
        currentParty.squadUp(playerCharacter.getName());
        playerCharacter.squadUp("");
        System.out.println("======================");
        playerCharacter.teleport("",currentParty.getName());
        currentParty.teleport(playerCharacter.getName(), currentParty.getName());
    }
}
