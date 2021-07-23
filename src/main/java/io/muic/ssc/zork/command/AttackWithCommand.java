package io.muic.ssc.zork.command;

import io.muic.ssc.zork.Player;

import io.muic.ssc.zork.Game;
import io.muic.ssc.zork.item.Item;

import java.util.List;

public class AttackWithCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "attack with";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isInGame()) {
            int damage = game.player.attackWith(args.get(0));
        }
        else {
            System.out.println("NOT IN GAME YET");
        }

    }
}
