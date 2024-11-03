package com.gof.design.pattens.prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;

public class ZipArchiver implements Archiver, Serializable {

    @Override
    public void archive(File directory) {
        System.out.println("Zip Archiver");
    }

    @Override
    public Archiver clone() {
        return (Archiver) SerializationUtils.clone(this);
    }
}
