package com.gof.design.pattens.prototype;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {

    private static Map<String, Archiver> prototypes = new HashMap<>();

    static {
        //Use enum on map
        prototypes.put("zip", new ZipArchiver());
        prototypes.put("rar", new RarArchiver());
    }

    public static Archiver getArchiver(String type) {
        return prototypes.get(type).clone();
    }

}
