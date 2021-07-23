package io.muic.ssc.zork.command;


import io.muic.ssc.zork.Game;

import java.util.List;

public class GoCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isInGame()) {
            if (game.curMap.go(args.get(0)) != null) {
                game.player.incrementHP();
            }
        }
        else {
            System.out.println("NOT IN GAME YET");
        }
    }
}
