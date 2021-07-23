package io.muic.ssc.zork;
import io.muic.ssc.zork.dungeon.Dungeon;
import io.muic.ssc.zork.dungeon.FireDungeon;
import io.muic.ssc.zork.dungeon.IceDungeon;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFactory {

    private static final Map<String, Dungeon> MAPS = new HashMap<>();
    private static final List<Class<? extends Dungeon>> REGISTERED_MAPS = Arrays.asList(
            IceDungeon.class,
            FireDungeon.class
    );

    static {
        {
            for (Class<? extends Dungeon> mapClass : REGISTERED_MAPS) {
                try {
                    Dungeon map = mapClass.getDeclaredConstructor().newInstance();
                    MAPS.put(map.getMapName(), map);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Dungeon get(String map) {
        return MAPS.get(map);
    }

//    public static void main(String[] args) {
//        System.out.println(MAPS.get("FireDungeon"));
//    }

}
