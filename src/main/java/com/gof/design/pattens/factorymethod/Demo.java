package com.gof.design.pattens.factorymethod;

import java.io.File;

public class Demo {

    public static void main(String[] args) {

        String archiverType1 = "zip";
        String archiverType2 = "rar";

        Archiver zipArchiver = ArchiverFactory.getArchiver(archiverType1);
        Archiver rarArchiver = ArchiverFactory.getArchiver(archiverType2);

        zipArchiver.archive(new File(""));
        rarArchiver.archive(new File(""));

        //To prove that each time is instanciated a new object
        System.out.println(ArchiverFactory.getArchiver("zip") == zipArchiver);

    }

}
