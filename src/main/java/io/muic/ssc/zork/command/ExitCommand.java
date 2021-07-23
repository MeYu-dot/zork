package io.muic.ssc.zork.command;

import io.muic.ssc.zork.Game;

import java.util.List;

public class ExitCommand implements Command {

    public int numArgs() {
        return 0;
    }

    public String getCommand() {
        return "exit";
    }

    public void execute(Game game, List<String> args) {
        game.getOutput().println("Game exit");

        game.exit();
    }
}
