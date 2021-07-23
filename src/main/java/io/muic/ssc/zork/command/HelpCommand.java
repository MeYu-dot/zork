package io.muic.ssc.zork.command;

import io.muic.ssc.zork.CommandFactory;
import io.muic.ssc.zork.Game;

import java.util.List;

public class HelpCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public void execute(Game game, List<String> args){
        List<String> allCommands = CommandFactory.getAllCommands();
        System.out.println("Commands:");
        for (String command: allCommands) {
            System.out.printf("- %s\n", command);
        }
    }
}
