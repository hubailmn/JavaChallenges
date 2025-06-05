package WarCardGame;

import Main.While;

public class Main {

    public static void main(String[] args) {


        WarGame L1 = new WarGame("1", "2");
        while (true) {
            WarGame.play();

            While.again();
        }

    } // void main


} // Main
