package io.muic.ssc.zork;

import io.muic.ssc.zork.command.Command;
import io.muic.ssc.zork.dungeon.Dungeon;

import java.util.List;
import java.util.Scanner;

public class Game {
    public Monster monster = new Monster();
    private GameOutput output = new GameOutput();
    private boolean startScreen = true;
    private CommandParser commandParser = new CommandParser();
    public Dungeon curMap;
    public boolean inGame;
    public Player player = new Player();

    public void run() {
        inGame = false;
        output.printStartingScreen();
        while (true) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            Command command = CommandFactory.get(words.get(0));
            if (command !=null) {
                command.execute(this, words.subList(1, words.size()));

            }
            output.println(s);
        }
    }
    public void play(String map) {
//        System.out.println(MapFactory.)
        curMap = MapFactory.get(map);
        if (curMap != null) {
            inGame = true;
            curMap.initialize();
            System.out.println("Entering " + curMap.getMapName() + "....");
        } else {
            System.out.println(map + " is not found");
        }
    }

    public GameOutput getOutput() {
        return output;
    }
    public void exit() {
        System.exit(0);
    }

    public boolean isInGame() {
        return inGame;
    }
}
