package com.jzy.game.engine.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ProjectNameMapUtil {


    private static ConcurrentMap<String, String> pnameMap = new ConcurrentHashMap<>();

    private static String P_NAME = "pname";

    public static String getName() {
        return pnameMap.get(P_NAME);
    }

    public static void setName(String name) {
        pnameMap.put(P_NAME, name);
    }


}
