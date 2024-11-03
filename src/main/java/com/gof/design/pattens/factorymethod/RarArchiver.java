package com.gof.design.pattens.factorymethod;

import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;

public class RarArchiver implements Archiver, Serializable {

    @Override
    public void archive(File directory) {
        System.out.println("Rar Archiver");
    }

}
