package Vidya;

import Vidya.PlayerCharacter.Allies;
import Vidya.NonPlayerCharacter.Friendly;
import Vidya.NonPlayerCharacter.Hostile;
import Vidya.PlayerCharacter.Self;

public class GameApp {
    static void main(String[] args) {
        Hostile madgePeasant = new Hostile(5,1334.256,"Grunt","Dunes");
        Friendly friendlyPeasant = new Friendly(2,100.5,"Priest","Cathedral");
        Allies currentParty = new Allies(19,983.93,"Tank","Dungeon");
        Self playerCharacter = new Self(25,4125.42,"Hero","Dungeon");

        madgePeasant.getDescription();
        friendlyPeasant.getDescription();
        currentParty.getDescription();
        playerCharacter.getDescription();
    }
}
