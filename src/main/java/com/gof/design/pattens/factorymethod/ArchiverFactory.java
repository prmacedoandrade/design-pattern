package com.gof.design.pattens.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Factory method sample
 */
public class ArchiverFactory {

    private static Map<String, Supplier<Archiver>> typeConstructorMap = new HashMap<>();

    static {
        //Use enum on map
        typeConstructorMap.put("zip", ZipArchiver::new);
        typeConstructorMap.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String type) {
        return typeConstructorMap.get(type) == null? null: typeConstructorMap.get(type).get();
    }

}
