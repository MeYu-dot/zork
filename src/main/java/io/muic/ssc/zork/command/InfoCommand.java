package io.muic.ssc.zork.command;

import io.muic.ssc.zork.Game;

import java.util.List;

public class InfoCommand implements Command {


    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isInGame()) {
            game.getOutput().printPlayerInfo(game.player);
            game.getOutput().printRoomInfo(game.curMap.curRoom);
            game.getOutput().printMonsterInfo(game.monster);
        }
        else {
            System.out.println("NOT IN GAME YET");
        }
    }
}
